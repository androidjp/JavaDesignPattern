package factory_abs.factory.impl;

import factory_abs.factory.MobileFactory;
import factory_abs.product.Os;
import factory_abs.product.Screen;
import factory_abs.product.impl.Android;
import factory_abs.product.impl.LGSoftScreen;

/**
 * Created by androidjp on 2016/10/24.
 */
public class LGFactory extends MobileFactory {
    @Override
    protected Os makeOs() {
        return new Android();
    }

    @Override
    protected Screen makeScreen() {
        return new LGSoftScreen(800,600);
    }
}
