package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by androidjp on 16/8/18.
 */
public class ConcreteContainer<T> implements Container<T> {
    private List<T> list = new ArrayList<T>();

    {
        System.out.println("代码块:"+list!=null);
    }

    public ConcreteContainer() {
        System.out.println(list!=null);
    }

    @Override
    public void add(T obj) {
        this.list.add(obj);
    }

    @Override
    public void remove(T obj) {
        this.list.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<T>(list);
    }
}
