package decorator;

/**
 * Created by androidjp on 16/8/20.
 */
public class CheapCloth extends PersonCloth {
    public CheapCloth(Person mPerson) {
        super(mPerson);
    }

    @Override
    public void dressed() {
        super.dressed();
        ///为dressed()方法进行额外的修饰
        dressHet();
    }

    private void dressHet() {
        System.out.println("戴上便宜的鸭嘴帽");
    }

}
