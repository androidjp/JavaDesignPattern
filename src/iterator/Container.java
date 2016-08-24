package iterator;

/**
 * Created by androidjp on 16/8/18.
 */
public interface Container<T> {

    void add(T obj);

    void remove(T obj);

    /**
     * @return 获取容器的迭代器对象
     */
    Iterator<T> iterator();
}
