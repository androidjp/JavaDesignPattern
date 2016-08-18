package interpreter;

/**
 * 数字解析器
 * Created by androidjp on 16/8/17.
 */
public class NumExpression extends ArithmeticExpression{

    private int num;

    public NumExpression(String s) {
        this.num = Integer.valueOf(s);
    }

    @Override
    public int interpret() {
        return num;
    }
}
