package interpreter;

import java.util.Scanner;
import java.util.Stack;

/**
 * 字符串解析为算术表达式 的过程
 * Created by androidjp on 16/8/17.
 */
public class StringCalculator {
    ///使用一个Stack来存储并操作所有相关的解释器
    protected Stack<ArithmeticExpression> mExpStack = new Stack<ArithmeticExpression>();

    public StringCalculator(String expression) {

        ArithmeticExpression exp1, exp2;

        String[] elements = expression.split(" ");

        for (int i =0;i<elements.length;i++){
            switch (elements[i].charAt(0)){
                case '+':
                    exp1 = mExpStack.pop();
                    exp2 = new NumExpression(elements[++i]);
                    mExpStack.push(new AdditionExpression(exp1,exp2));
                    break;
                case '-':
                    exp1 = mExpStack.pop();
                    exp2 = new NumExpression(elements[++i]);
                    mExpStack.push(new SubtractionExpression(exp1,exp2));
                    break;
                default:
                    mExpStack.push(new NumExpression(elements[i]));
                    break;
            }
        }
    }

    public ArithmeticExpression output(){
        return mExpStack.peek();
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        StringCalculator calculator = new StringCalculator(scanner.nextLine());
        System.out.println(calculator.mExpStack.pop().interpret()+"");
    }
}
