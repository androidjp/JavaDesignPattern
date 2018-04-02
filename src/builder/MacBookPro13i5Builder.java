package builder;

public class MacBookPro13i5Builder extends ComputerBuilder {

  private Computer computer = new Computer();
  {
    computer.setBrand("MacBookPro");
    computer.setOs("MacOS");
  }

  @Override
  public ComputerBuilder buildScreen() {
    this.computer.setScreen("Retina15寸");
    return this;
  }

  @Override
  public ComputerBuilder buildCpu() {
    this.computer.setCpu("i7");
    return this;
  }

  @Override
  public Computer build() {
    return this.computer;
  }
}
