package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 订阅者 Person
 * Created by androidjp on 16/8/18.
 */
public class Person implements Observer {

    private String name;

    public Person(String name){
        this.name = name;
    }


    @Override
    public void update(Observable o, Object arg) {
        String res = (String) arg;
        System.out.println(this.name+"说: News来了 :"+res);
        o.deleteObserver(this);
    }
}
