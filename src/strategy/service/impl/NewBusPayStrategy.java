package strategy.service.impl;

import strategy.bean.IcCardRecord;
import strategy.service.BusPayStrategy;

public class NewBusPayStrategy implements BusPayStrategy {
  @Override
  public double calculateBusPay(IcCardRecord icCardRecord) {
    long getOffTime = icCardRecord.getGetOffTimeStamp().getTime();
    long getOnTime = icCardRecord.getGetOnTimeStamp().getTime();
    long resSeconds = (getOffTime - getOnTime) / 1000;
    return 0.02 * resSeconds;
  }
}
