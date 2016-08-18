package interpreter;

/**
 * 算术运算表达式解析器
 * Created by androidjp on 16/8/17.
 */
public abstract class ArithmeticExpression {

    /**
     * 抽象的解析方法
     * @return 解析到具体的值
     */
    public abstract int interpret();
}
