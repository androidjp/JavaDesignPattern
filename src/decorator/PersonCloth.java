package decorator;

/**
 * Person类的装饰类
 * Created by androidjp on 16/8/20.
 */
public abstract class PersonCloth extends Person {

    private Person mPerson;

    public PersonCloth(Person mPerson) {
        this.mPerson = mPerson;
    }

    @Override
    public void dressed() {
        this.mPerson.dressed();
    }
}
