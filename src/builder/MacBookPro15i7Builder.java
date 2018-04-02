package builder;

public class MacBookPro15i7Builder extends ComputerBuilder {

  private Computer computer = new Computer();
  {
    computer.setBrand("MacBookPro");
    computer.setOs("MacOS");
  }
  @Override
  public ComputerBuilder buildScreen() {
    this.computer.setScreen("Retina13寸");
    return this;
  }

  @Override
  public ComputerBuilder buildCpu() {
    this.computer.setCpu("i5");
    return this;
  }

  @Override
  public Computer build() {
    return this.computer;
  }
}
