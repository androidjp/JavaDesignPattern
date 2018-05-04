package strategy.bean;

import strategy.service.BusRecordStrategy;
import strategy.service.impl.OldBusRecordStrategy;

public class Bus {

  private BusRecordStrategy busRecordStrategy;

  public Bus() {
    this.busRecordStrategy = new OldBusRecordStrategy();
  }

  public void setBusRecordStrategy(BusRecordStrategy busRecordStrategy) {
    this.busRecordStrategy = busRecordStrategy;
  }

  public void getOn(String icCardId){
    System.out.println(icCardId + " 已上车");
    this.busRecordStrategy.recordGetOn(icCardId);
  }

  public void getOff(String icCardId){
    System.out.println(icCardId + " 已下车");
    this.busRecordStrategy.recordGetOff(icCardId);
  }
}
