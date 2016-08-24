package visitor;

import java.util.Random;

/**
 * Created by androidjp on 16/8/19.
 */
public class PM extends Staff {

    private int productCount;//产品数量

    public PM(String name) {
        super(name);

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProductCount(){
        productCount = new Random().nextInt(10);
        return productCount;
    }
}
