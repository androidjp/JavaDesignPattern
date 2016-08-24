package iterator;

/**
 * Created by androidjp on 16/8/18.
 */
public interface Iterator<T> {


    /**
     * @return 是否还有下一个元素
     */
    boolean hasNext();

    /**
     * 返回当前位置的元素,并移动到下一个元素
     * @return 当前位置的元素
     */
    T next();

}
