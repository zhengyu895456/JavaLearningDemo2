package com.zeroten.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class User2DaoCglibProxy implements MethodInterceptor {
    private Object object;
    public User2DaoCglibProxy(Object object){
        this.object = object;
    }
    public Object getProxyInstance(){
        Enhancer en = new Enhancer();
        en.setSuperclass(object.getClass());
        en.setCallback(this);
        return en.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始执行");
        Object result = method.invoke(object, objects);
        System.out.println("结束执行");
        return result;
    }
}
