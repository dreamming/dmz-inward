package com.dmz;

/**
 * Created by dmz on 2016/4/28.
 */
public class Money {
    public static void main(String[] args){
        /**
         * caculate money
         */
        double ylv=0.00583f;
        int bj = 1500000;
        int hkys = 50*12;
        double a;
        double b;
        a = bj*ylv*Math.pow((1+ylv),hkys);
        b=Math.pow((1+ylv),hkys)-1;

        double c = a / b;
        System.out.format("贷款%d个月\n",hkys);
        System.out.println("等额本息:"+c);
        for (int n=1;n<=hkys;n++){
            double bb = bj/n+(bj-(n-1)*bj/n)*ylv;
            System.out.format("等额本金(%d月):%f \n",n,bb);

        }

    }
}
