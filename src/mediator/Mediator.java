package mediator;

/**
 * 中介
 * Created by androidjp on 16/8/19.
 */
public abstract class Mediator {

    /**
     * 一个同事类做了点事情,改变了点状态和数据等,就会将这个改变传递给中介,中介再去通知其他同事类
     * @param c 同事类
     */
    protected abstract void changed(Colleague c);
}
