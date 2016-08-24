package proxy.proxy_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * (利用了 反射机制中的 '动态代理接口' 动态生成代理者的对象)
 *
 * Created by androidjp on 16/8/19.
 */
public class DynamicProxy implements InvocationHandler {
    Object obj;///被代理者的引用

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        ///通过反射调用方法 去执行一个方法
        Object result = method.invoke(obj, args);
        return result;
    }
}
