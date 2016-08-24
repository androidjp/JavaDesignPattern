package visitor;

/**
 * Created by androidjp on 16/8/19.
 */
public interface Visitor {

    void visit(Coder coder);

    void visit(PM pm);
}
