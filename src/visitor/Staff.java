package visitor;

import java.util.Random;

/**
 * Created by androidjp on 16/8/19.
 */
public abstract class Staff {

    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public abstract void accept(Visitor visitor);
}
