package bridge;

import static java.lang.Math.abs;

/**
 * 电脑屏幕(Y轴)
 * Created by androidjp on 16/8/20.
 */
public abstract class Screen {

    private int width;
    private int height;

    public float getScreenInch(){
        this.width = onCalculateWidth();
        this.height = onCalculateHeight();
        return abs(this.width*this.width + this.height*this.height);
    }

    protected abstract int onCalculateWidth();
    protected abstract int onCalculateHeight();

}
