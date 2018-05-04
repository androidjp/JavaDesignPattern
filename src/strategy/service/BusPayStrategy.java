package strategy.service;

import strategy.bean.IcCardRecord;

public interface BusPayStrategy {
  public double calculateBusPay(IcCardRecord icCardRecord);
}
