package com.zeroten.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//JDK动态代理，事件处理器，实现接口InvocationHandler
public class UserInvocationHandler implements InvocationHandler {
    public Object object;
    public UserInvocationHandler(Object object){
        this.object = object;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("开始执行");
        if (args.length == 1 && args != null){
            if (args[0] instanceof User){
                System.out.println("参数1是User");
                User user =(User) args[0];
                if (user.getName() == null || user.getName().trim().length() == 0){
                    System.out.println("姓名为空，不保存");
                    return false;
                }
                if (user.getAge() == null || user.getAge() < 0){
                    System.out.println("年龄小于0，不保存");
                    return false;
                }
            }
        }
        Object result = method.invoke(object,args);
        System.out.println("执行结束");
        return result;
    }
}
