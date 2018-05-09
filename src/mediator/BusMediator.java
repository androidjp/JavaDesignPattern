package mediator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BusMediator extends Mediator<BusDriver> {
  private Map<String, BusDriver> busDriverGroup = new HashMap<>();

  public void addDriver(BusDriver busDriver) {
    this.busDriverGroup.put(busDriver.getName(), busDriver);
  }

  @Override
  protected void changed(BusDriver c) {
    Iterator<Map.Entry<String, BusDriver>> it = this.busDriverGroup.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<String, BusDriver> item = it.next();
      if (item.getKey().equals(c.getName())) {
        continue;
      }
      item.getValue().receiveMsg(c.toString());
    }
  }
}
