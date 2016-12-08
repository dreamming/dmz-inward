package com.dmz;

import com.alibaba.dubbo.rpc.RpcContext;
import com.dmz.facade.ISaySomeWord;
import com.dmz.facade.TestDubbo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by dmz on 2016/1/6.
 */
@Repository(value="DMZ")
public class SaySomeWordImpl implements ISaySomeWord {
//    @Autowired
//    private TestDubbo test;
    public SaySomeWordImpl(){
        System.out.println("public construct SaySomeWordImpl !");
    }
    public String saySome()  {
//        InetAddress  addr = null;
//        try {
//            addr = InetAddress.getLocalHost();
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        }
//        return addr.getHostAddress().toString();
        String ConsumerIp =  RpcContext.getContext().getRemoteAddressString();
        return "ConsumerIP-------"+ConsumerIp+"\n我是来自win7";
    }
}
