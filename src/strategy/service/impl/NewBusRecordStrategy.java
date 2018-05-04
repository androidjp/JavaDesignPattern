package strategy.service.impl;

import strategy.bean.IcCardRecord;
import strategy.service.BusPayStrategy;
import strategy.service.BusRecordStrategy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class NewBusRecordStrategy extends BusRecordStrategy {
  private Map<String , IcCardRecord> passengerRecordMap;

  public NewBusRecordStrategy() {
    this(new NewBusPayStrategy());
    this.passengerRecordMap = new HashMap<>();
  }

  public NewBusRecordStrategy(BusPayStrategy payStrategy) {
    super(payStrategy);
  }

  @Override
  public void recordGetOn(String icCardId) {
    IcCardRecord icCardRecord = null;
    if (passengerRecordMap.containsKey(icCardId)) {
       icCardRecord = passengerRecordMap.get(icCardId);
    }else {
      icCardRecord = new IcCardRecord();
      icCardRecord.setId(icCardId);
    }
    icCardRecord.setGetOnTimeStamp(new Date());
    this.passengerRecordMap.put(icCardId,icCardRecord);
  }

  @Override
  public void recordGetOff(String icCardId) {
    IcCardRecord icCardRecord = passengerRecordMap.get(icCardId);
    if (icCardRecord!=null) {
      icCardRecord.setGetOffTimeStamp(new Date());
    }
    double cost = this.payStrategy.calculateBusPay(icCardRecord);
    this.passengerRecordMap.remove(icCardId);
    System.out.printf("%s扣费：%.2f元\n", icCardId,cost);
  }
}
