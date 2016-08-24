package bridge.impl;

import bridge.Screen;

/**
 * Created by androidjp on 16/8/20.
 */
public class Retina extends Screen {
    @Override
    protected int onCalculateWidth() {
        return 3200;
    }

    @Override
    protected int onCalculateHeight() {
        return 1600;
    }
}
