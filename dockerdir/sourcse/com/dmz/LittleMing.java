package com.dmz;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by dmz on 2016/1/7.
 */
@Repository(value="ming")
public class LittleMing {
    public LittleMing(){
        System.out.println("public construct Little Ming !");
    }
}
