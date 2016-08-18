package command;

/**
 * 具体命令
 * Created by androidjp on 16/8/18.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;//持有接收者的引用

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.action();
    }
}
