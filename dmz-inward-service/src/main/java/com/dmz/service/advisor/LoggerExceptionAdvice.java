package com.dmz.service.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by dmz on 2016/8/19.
 */
public class LoggerExceptionAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        Object result = methodInvocation.getMethod().getReturnType().newInstance();
        try {
            return methodInvocation.proceed();
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
}
