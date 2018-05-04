package strategy.bean;

import java.util.Date;

public class IcCardRecord {
  private String id;
  private Date getOnTimeStamp;
  private Date getOffTimeStamp;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getGetOnTimeStamp() {
    return getOnTimeStamp;
  }

  public void setGetOnTimeStamp(Date getOnTimeStamp) {
    this.getOnTimeStamp = getOnTimeStamp;
  }

  public Date getGetOffTimeStamp() {
    return getOffTimeStamp;
  }

  public void setGetOffTimeStamp(Date getOffTimeStamp) {
    this.getOffTimeStamp = getOffTimeStamp;
  }
}
