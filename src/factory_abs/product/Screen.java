package factory_abs.product;

/**
 * Created by androidjp on 2016/10/24.
 */
public abstract class Screen {
    protected int width;
    protected int height;

    protected abstract void show();
    protected abstract int colorCount();
    protected int[] deminsion(){
        return new int[]{this.width , this.height};
    }
}
