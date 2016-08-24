package decorator;

/**
 * Created by androidjp on 16/8/20.
 */
public class Test {

    public static void main(String[] args){
        Person person = new XiaoMing();

        System.out.println("今天普普通通:");
        PersonCloth personClothA = new CheapCloth(person);
        personClothA.dressed();
        System.out.println();
        System.out.println("今天装个富人吧:");
        PersonCloth personClothB = new ExpensiveCloth(person);
        personClothB.dressed();


    }
}
