package com.dmz.service;


import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by dmz on 2016/11/22.
 */
public class ImprovedEnumTypeAdapter extends TypeAdapter<SuperEnum> {

    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            try {
                Class<?> clazz = Class.forName(typeToken.getRawType().getTypeName());
                Class<?>[] interfaces = clazz.getInterfaces();
                for (Class interFace : interfaces) {
                    if (SuperEnum.class.getTypeName().equals(interFace.getTypeName())) {
                        return (TypeAdapter<T>) new ImprovedEnumTypeAdapter(typeToken);
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return null;
        }
    };

    private TypeToken typeToken;

    private ImprovedEnumTypeAdapter(TypeToken typeToken) {
        this.typeToken = typeToken;
    }
    @Override
    public synchronized void write(JsonWriter jsonWriter, SuperEnum superEnum) throws IOException {
        if (superEnum == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.value(superEnum.getValue());
    }

    @Override
    public SuperEnum read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        } else {
            return this.deserializeToEnum(jsonReader.nextString());
        }
    }

    private synchronized SuperEnum deserializeToEnum(String json) {

        SuperEnum superEnum = null;
        try {
            Class<?> clazz = Class.forName(typeToken.getRawType().getTypeName());
            Method parseMethod = clazz.getDeclaredMethod("parse", String.class);
            if (parseMethod == null) {
                // no parse method
            }
            superEnum = (SuperEnum) parseMethod.invoke(typeToken.getClass(), json);

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
