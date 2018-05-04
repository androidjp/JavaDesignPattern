package strategy;

import strategy.bean.Bus;
import strategy.service.impl.NewBusRecordStrategy;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Bus busK10 = new Bus();
    busK10.getOn("card001");
    busK10.getOn("card002");
    Thread.sleep(2000);
    busK10.getOff("card002");
    busK10.getOff("card001");

    Thread.sleep(1000);
    busK10.setBusRecordStrategy(new NewBusRecordStrategy());
    Thread.sleep(1000);
    busK10.getOn("card001");
    busK10.getOn("card002");
    Thread.sleep(2000);
    busK10.getOff("card002");
    Thread.sleep(2000);
    busK10.getOff("card001");


  }
}
