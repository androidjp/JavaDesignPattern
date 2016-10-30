package factory_abs.product.impl;

import factory_abs.product.Screen;

/**
 * Created by androidjp on 2016/10/24.
 */
public class RetinaScreen extends Screen {

    public RetinaScreen(){
        this.width = 2560;
        this.height = 1600;
    }


    @Override
    protected void show() {
        System.out.println("Retina LCD 屏");
    }

    @Override
    protected int colorCount() {
        return 32;
    }
}
