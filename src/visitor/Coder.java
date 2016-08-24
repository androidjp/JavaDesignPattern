package visitor;

import java.util.Random;

/**
 * 开发工程师
 * Created by androidjp on 16/8/19.
 */
public class Coder extends Staff {

    private long codeLine;//已敲过 代码行数

    public Coder(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * @return 代码量
     */
    public long  getCodeLines(){
        codeLine =  new Random().nextInt(10*10000);
        return codeLine;
    }
}
