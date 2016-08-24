package decorator;

/**
 * Created by androidjp on 16/8/20.
 */
public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person mPerson) {
        super(mPerson);
    }

    @Override
    public void dressed() {
        super.dressed();
        ///为dressed()方法进行额外的修饰
        dressHet();
        doingHair();
        wearWatch();
    }

    private void dressHet() {
        System.out.println("戴上高贵的帽子");
    }

    private void doingHair() {
        System.out.println("做个高贵的头发");
    }


    private void wearWatch() {
        System.out.println("戴上劳力士");
    }
}
