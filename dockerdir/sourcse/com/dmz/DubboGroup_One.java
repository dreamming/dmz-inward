package com.dmz;

import com.alibaba.dubbo.config.annotation.Service;
import com.dmz.facade.IDubboGroup;

/**
 * Created by dmz on 2016/1/12.
 */
@Service(version = "1.0")
public class DubboGroup_One implements IDubboGroup {
    private DubboGroup_One(){
        System.out.println("DubboGroup_One Constructor!");
    }
    public String DubboGroup() {
        return "DubboGroup_One";
    }
}
