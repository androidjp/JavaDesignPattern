package status;

public class Main {
  public static void main(String[] args) {
    MyCompany company = new MyCompany();
    company.startNewDay();
    company.run();
    company.workDone();
    company.run();
  }
}
