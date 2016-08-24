package visitor;

/**
 * Created by androidjp on 16/8/19.
 */
public class CEOVisitor implements Visitor {


    @Override
    public void visit(Coder coder) {
        System.out.println(coder.name+" 的 kpi : "+ coder.kpi);
    }

    @Override
    public void visit(PM pm) {
        System.out.println(pm.name+" 的 kpi : "+ pm.kpi);
    }
}
