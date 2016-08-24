package iterator;

/**
 * Created by androidjp on 16/8/18.
 */
public class Test {

    public static void main(String[] args){
        Container<String> container = new ConcreteContainer<String>();

        container.add("AAA");
        container.add("BBB");
        container.add("CCC");

        Iterator<String> iterator = container.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
