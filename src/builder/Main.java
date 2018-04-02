package builder;

import composite.abs.Dir;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();
    Computer computer = director.construct(Director.MAC_BOOK_PRO_13_i5);
    System.out.println(computer.toString());
    computer = director.construct(Director.MAC_BOOK_PRO_15_i7);
    System.out.println(computer.toString());
  }
}
