package com.dmz;

import com.dmz.facade.IAnnotationDubbo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by dmz on 2016/1/6.
 */
public class StartDubbo {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-dubbo-provider.xml","classpath:initProperties.xml");
        System.out.println("容器初始化完成。。");
        IAnnotationDubbo dmz = (IAnnotationDubbo)context.getBean("dmz");
        System.out.println(dmz.annotation());
        context.start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
