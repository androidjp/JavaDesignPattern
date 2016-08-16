package strategy;

/**
 * Created by androidjp on 16/8/16.
 */
public class BusPayServer extends  PayServer<Double> {


    public static void main(String[] args){
        BusPayServer busPayServer = new BusPayServer();
        busPayServer.setPayStrategy(new BusOldPayStrategy());
        busPayServer.calculatePayment(10d);
        busPayServer.setPayStrategy(new BusNewPayStrategy());
        busPayServer.calculatePayment(10d);
    }
}
