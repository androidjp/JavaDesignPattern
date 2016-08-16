package strategy;

/**
 * Created by androidjp on 16/8/16.
 */
public class PayServer<M> {

    private PayStrategy<M> mPayStrategy;

    public void setPayStrategy(PayStrategy<M> strategy){
        mPayStrategy = strategy;
    }

    protected void calculatePayment(M materials){
        this.mPayStrategy.calculateMoney(materials);
    }


}
