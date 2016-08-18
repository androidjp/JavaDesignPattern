package command;

/**
 * Created by androidjp on 16/8/18.
 */
public class Client {

    public static void main(String[] args){
        //1. 实例化 接收者
        Receiver receiver = new Receiver();

        //2. 实例化 命令
        Command commandA = new ConcreteCommand(receiver);

        //3. 实例化 请求者
        Invoker invoker = new Invoker(commandA);

        invoker.action();
    }
}
