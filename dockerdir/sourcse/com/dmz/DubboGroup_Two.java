package com.dmz;

import com.alibaba.dubbo.config.annotation.Service;
import com.dmz.facade.IDubboGroup;

/**
 * Created by dmz on 2016/1/12.
 */
@Service(version = "2.0")
public class DubboGroup_Two implements IDubboGroup {
    private DubboGroup_Two(){
        System.out.println("DubboGroup_Two Constructor!");
    }
    public String DubboGroup() {
        return "DubboGroup_Two";
    }
}
