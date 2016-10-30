package factory_abs.factory;

import factory_abs.product.Os;
import factory_abs.product.Screen;

/**
 * Created by androidjp on 2016/10/24.
 */
public abstract class MobileFactory {

    protected abstract Os makeOs();

    protected abstract Screen makeScreen();
}
