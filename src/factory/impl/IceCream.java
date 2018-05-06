package factory.impl;

import factory.Product;

/**
 * Created with IntelliJ IDEA.
 * User: androidjp
 * Date: 2018/4/2
 * Time: 下午7:53
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class IceCream extends Product {
    @Override
    public void msg() {
        System.out.println("我是雪糕");
    }
}
