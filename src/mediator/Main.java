package mediator;

public class Main {
  public static void main(String[] args) {
    BusMediator busMediator = new BusMediator();
    BusDriver a = new BusDriver("A", busMediator);
    BusDriver b = new BusDriver("B", busMediator);
    BusDriver c = new BusDriver("C", busMediator);

    busMediator.addDriver(a);
    busMediator.addDriver(b);
    busMediator.addDriver(c);

    a.onWork();
    b.offwork();

  }
}
