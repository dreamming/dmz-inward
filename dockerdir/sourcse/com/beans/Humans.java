package com.beans;

import com.aopi.Sleepable;
import com.aopi.Work;

/**
 * Created by dmz on 2016/2/15.
 */
public class Humans implements Sleepable,Work {
    public void sleep() {
        System.out.println("我要睡觉啦!");
    }

    public void work() {
        System.out.println("开始工作！");
    }
}
