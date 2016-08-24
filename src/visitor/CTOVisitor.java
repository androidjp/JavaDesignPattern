package visitor;

/**
 * Created by androidjp on 16/8/19.
 */
public class CTOVisitor implements Visitor {
    @Override
    public void visit(Coder coder) {
        System.out.println(coder.name+"的代码量: "+ coder.getCodeLines());
    }

    @Override
    public void visit(PM pm) {
        System.out.println(pm.name+"的产品数: "+ pm.getProductCount());
    }
}
