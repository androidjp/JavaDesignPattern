package interpreter.impl;

import interpreter.ArithmeticExpression;
import interpreter.OperatorExpression;

/**
 * 加法运算解析器
 * Created by androidjp on 16/8/17.
 */
public class AdditionExpression extends OperatorExpression {

    public AdditionExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}
