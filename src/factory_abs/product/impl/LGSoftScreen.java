package factory_abs.product.impl;

import factory_abs.product.Screen;

/**
 * Created by androidjp on 2016/10/24.
 */
public class LGSoftScreen extends Screen {

    public LGSoftScreen(){
        this.width = 1920;
        this.height =1080;
    }

    public LGSoftScreen(int width, int height){
        this.width =width;
        this.height =height;
    }

    @Override
    public void show() {
        System.out.println("我是LG柔性屏");
    }

    @Override
    public int colorCount() {
        return 32;
    }
}
