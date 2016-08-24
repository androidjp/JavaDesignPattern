package bridge.impl;

import bridge.Computer;
import bridge.Screen;

/**
 * 微软 Surface
 * Created by androidjp on 16/8/20.
 */
public class MicroSurface extends Computer{


    public MicroSurface(Screen screen) {
        super(screen);
    }

    @Override
    protected void setOs() {
        System.out.println("windows 10 系统");
    }

    @Override
    protected void addHardware() {
        System.out.println("sony音响、巧克力键盘");
    }
}
