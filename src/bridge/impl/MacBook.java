package bridge.impl;

import bridge.Computer;
import bridge.Screen;

/**
 * MacBook
 * Created by androidjp on 16/8/20.
 */
public class MacBook extends Computer{


    public MacBook(Screen screen) {
        super(screen);
    }

    @Override
    protected void setOs() {
        System.out.println("MAC OS");
    }

    @Override
    protected void addHardware() {
        System.out.println("sony音响、巧克力键盘");
    }
}
