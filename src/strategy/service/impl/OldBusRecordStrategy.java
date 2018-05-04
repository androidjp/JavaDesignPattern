package strategy.service.impl;

import strategy.service.BusRecordStrategy;

public class OldBusRecordStrategy extends BusRecordStrategy {

  public OldBusRecordStrategy() {
    super(new OldBusPayStrategy());
  }

  @Override
  public void recordGetOn(String icCardId) {
    double cost = this.payStrategy.calculateBusPay(null);
    System.out.printf("%s扣费：%.2f元\n", icCardId,cost);
  }

  @Override
  public void recordGetOff(String icCardId) {
  }
}
