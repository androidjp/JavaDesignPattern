package strategy;

/**
 * Created by androidjp on 16/8/16.
 */
public class BusOldPayStrategy implements PayStrategy<Double> {
    @Override
    public double calculateMoney(Double speeding) {

        System.out.println("我的Bus乘车费用:" + speeding*1.5);
        return speeding*1.5;
    }
}
