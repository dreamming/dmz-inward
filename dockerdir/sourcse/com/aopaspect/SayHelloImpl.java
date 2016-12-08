package com.aopaspect;

import com.aopi.SayHello;
import org.springframework.stereotype.Component;

/**
 * Created by dmz on 2016/2/2.
 */
@Component
public class SayHelloImpl implements SayHello {
    public void sayHelloTo(String name) {
//        System.out.println("Hello,"+name);
        tempSayTo(name);
    }

    public String returnSay(String name) {
        System.out.println("---------------------------");
        return "yinming";
    }

    private void tempSayTo(String name){
        System.out.println("Hello,"+name);
    }
}
