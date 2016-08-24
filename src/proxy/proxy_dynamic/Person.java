package proxy.proxy_dynamic;

/**
 * Created by androidjp on 16/8/19.
 */
public class Person implements Animal{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 大笑
     */
    @Override
    public void laugh(){
        System.out.println("我就是"+this.name+",哈哈哈");
    }
}
