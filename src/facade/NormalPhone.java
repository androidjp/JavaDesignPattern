package facade;

/**
 * Created by androidjp on 16/8/20.
 */
public class NormalPhone implements Phone {
    @Override
    public void dail() {
        System.out.println("开始拨号");
    }
}
