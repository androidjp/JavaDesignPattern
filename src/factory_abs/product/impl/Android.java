package factory_abs.product.impl;

import factory_abs.product.Os;

/**
 * Created by androidjp on 2016/10/24.
 */
public class Android implements Os {
    @Override
    public int whichBit() {
        return 64;
    }

    @Override
    public String msg() {
        return "Android欢迎你";
    }

    @Override
    public String base() {
        return "Linux";
    }
}
