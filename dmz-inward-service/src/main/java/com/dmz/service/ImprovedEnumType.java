package com.dmz.service;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * Created by dmz on 2016/11/22.
 */
public class ImprovedEnumType implements JsonDeserializer<SuperEnum> {

    @Override
    public SuperEnum deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        String value = json.getAsString();
        SuperEnum superEnum = null;
        try {
            Class<?> clazz = Class.forName(typeOfT.getTypeName());
            Method parseMethod = clazz.getDeclaredMethod("parse", String.class);
            if (parseMethod == null) {
            // no parse method
            }
            superEnum = (SuperEnum) parseMethod.invoke(typeOfT.getClass(), value);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return superEnum;
    }

}
