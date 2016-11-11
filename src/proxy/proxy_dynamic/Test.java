package proxy.proxy_dynamic;

import java.lang.reflect.Proxy;

/**
 * Created by androidjp on 16/8/19.
 */
public class Test {

    public static void main(String[] args){
        Animal person = new Person("小明",20);
        //构建一个动态代理对象
        DynamicProxy proxy = new DynamicProxy(person);

        //获取小明的类的类加载器
        ClassLoader loader = person.getClass().getClassLoader();

        //动态代理，无非是两个主要类：Proxy类 和  InvocationHandler接口实现类（也就是 代理类），
        // 前者负责封装和创建动态代理对象，而后者负责封装真实对象并接管真实对象的相关方法操作
        Animal proxyOfPerson = (Animal) Proxy.newProxyInstance(loader, new Class[]{Animal.class}, proxy);


        ///代理者,代替小明 大笑
        proxyOfPerson.laugh();
    }
}
