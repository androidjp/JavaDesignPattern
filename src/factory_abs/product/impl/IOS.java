package factory_abs.product.impl;

import factory_abs.product.Os;

/**
 * Created by androidjp on 2016/10/24.
 */
public class IOS implements Os {
    @Override
    public int whichBit() {
        return 64;
    }

    @Override
    public String msg() {
        return "欢迎使用IOS10";
    }

    @Override
    public String base() {
        return "Unix";
    }
}
