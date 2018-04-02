package builder;

import java.util.HashMap;
import java.util.Map;

/**
 * 此类用于构造computer
 * 可要可不要（为了统一一个生产过程，然后，赋值不同的Builder即可）
 *
 * @author JP
 */
public class Director {
  public static final String MAC_BOOK_PRO_13_i5 = "MAC_BOOK_PRO_13_i5";
  public static final String MAC_BOOK_PRO_15_i7 = "MAC_BOOK_PRO_15_i7";

  public Computer construct(String brand) {
    ComputerBuilder computerBuilder = null;

    if (MAC_BOOK_PRO_13_i5.equals(brand)) {
      computerBuilder = new MacBookPro13i5Builder();
    } else if (MAC_BOOK_PRO_15_i7.equals(brand)) {
      computerBuilder = new MacBookPro15i7Builder();
    }

    return computerBuilder
        .buildCpu()
        .buildScreen()
        .build();
  }
}
