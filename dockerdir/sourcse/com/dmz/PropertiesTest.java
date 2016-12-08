package com.dmz;

import com.dmz.facade.IPropertiesTest;

/**
 * Created by dmz on 2016/1/20.
 */
public class PropertiesTest implements IPropertiesTest {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public String readProperties() {
        return this.name;
    }
}
