package factory_abs.factory.impl;

import factory_abs.factory.MobileFactory;
import factory_abs.product.Os;
import factory_abs.product.Screen;
import factory_abs.product.impl.IOS;
import factory_abs.product.impl.RetinaScreen;

/**
 * Created by androidjp on 2016/10/24.
 */
public class AppleFactory extends MobileFactory {
    @Override
    protected Os makeOs() {
        return new IOS();
    }

    @Override
    protected Screen makeScreen() {
        return new RetinaScreen();
    }
}
