package com.dmz;

import org.springframework.stereotype.Component;

/**
 * Created by dmz on 2016/1/8.
 */
@Component
public class LazyInitDaoImpl implements LazyInitDao {

    public LazyInitDaoImpl(){
        System.out.println("LazyInitDaoImpl Construct!");
    }
    public String sayLazyInitDao() {
        return "Spring LazyDao Test";
    }
}
