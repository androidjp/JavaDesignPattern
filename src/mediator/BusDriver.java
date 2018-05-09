package mediator;

public class BusDriver extends Colleague {
  private String name;
  private String status;

  public BusDriver(String name, Mediator mediator) {
    super(mediator);
    this.name = name;
    this.status = "offWork";
  }

  public void receiveMsg(String msg) {
    System.out.println(this.name + " 收到了消息： " + msg);
  }

  public void onWork() {
    this.status = "onWork";
    this.mediator.changed(this);
  }

  public void offwork() {
    this.status = "offWork";
    this.mediator.changed(this);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "BusDriver{" +
        "name='" + name + '\'' +
        ", status='" + status + '\'' +
        '}';
  }
}
