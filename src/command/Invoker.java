package command;

/**
 * 请求者
 * Created by androidjp on 16/8/18.
 */
public class Invoker {
    private Command command;//持有相应命令的引用

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
