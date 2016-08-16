package strategy;

/**
 * Created by androidjp on 16/8/16.
 */
public interface PayStrategy<M> {
    public double calculateMoney(M speeding);
}
