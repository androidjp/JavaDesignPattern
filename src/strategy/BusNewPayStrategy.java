package strategy;

/**
 * Created by androidjp on 16/8/16.
 */
public class BusNewPayStrategy implements PayStrategy<Double> {
    @Override
    public double calculateMoney(Double speeding) {

        System.out.println("我的Bus乘车费用:" + speeding*2.0);
        return speeding*2.0;
    }
}
