package com.dmz.service.advisor;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by dmz on 2016/3/18.
 */
public class LoggerAdvisor implements MethodBeforeAdvice {

    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Class : "+ target.getClass().getName());
        System.out.println("Method : "+ method.getName());
        for(int i=0; i<args.length; i++){
            System.out.println("Arg : "+ i + " -> " + args[i].toString());
        }
    }
}
