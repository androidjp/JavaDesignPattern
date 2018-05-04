package strategy.service.impl;

import strategy.bean.IcCardRecord;
import strategy.service.BusPayStrategy;

public class OldBusPayStrategy implements BusPayStrategy {
  private final double BASIC_COST = 2.0;

  @Override
  public double calculateBusPay(IcCardRecord icCardRecord) {
    return BASIC_COST;
  }
}
