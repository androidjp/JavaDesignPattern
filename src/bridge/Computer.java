package bridge;

/**
 * 计算机抽象类(X轴)
 * Created by androidjp on 16/8/20.
 */
public abstract class Computer {
    protected Screen screen;

    public Computer(Screen screen) {
        this.screen = screen;
    }

    /**
     * 组装流程
     */
    public void build(){
        addHardware();
        setOs();
    }

    protected abstract void setOs();

    protected abstract void addHardware();
}
