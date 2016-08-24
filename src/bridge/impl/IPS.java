package bridge.impl;

import bridge.Screen;

/**
 * Created by androidjp on 16/8/20.
 */
public class IPS extends Screen{

    @Override
    protected int onCalculateWidth() {
        return 1920;
    }

    @Override
    protected int onCalculateHeight() {
        return 1080;
    }
}
