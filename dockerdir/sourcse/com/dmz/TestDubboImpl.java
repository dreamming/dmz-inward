package com.dmz;

import com.dmz.facade.TestDubbo;
import org.springframework.stereotype.Component;

/**
 * Created by dmz on 2016/1/12.
 */
@Component
public class TestDubboImpl implements TestDubbo {
    private TestDubboImpl(){
        System.out.println("TestDubboImpl Constructor!");
    }
}
