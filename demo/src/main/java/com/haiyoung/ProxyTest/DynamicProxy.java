package com.haiyoung.ProxyTest;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    private Object obj;

    public Object bind(Object obj){
        this.obj = obj;
        // 返回代理类实例
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //　　在代理真实对象前我们可以添加一些自己的操作
        System.out.println("before ... ... ...");
        System.out.println("Method:" + method);
        //    当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object res = method.invoke(obj, args);
        //　　在代理真实对象后我们也可以添加一些自己的操作
        System.out.println("after ... ... ...");
        return res;

    }
}
