package strategy.service;

public abstract class BusRecordStrategy {

  protected BusPayStrategy payStrategy;

  public BusRecordStrategy(BusPayStrategy payStrategy) {
    this.payStrategy = payStrategy;
  }

  public abstract void recordGetOn(String icCardId);

  public abstract void recordGetOff(String icCardId);

}
