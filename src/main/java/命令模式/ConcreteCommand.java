package 命令模式;

public class ConcreteCommand implements Command {//具体命令类
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver=receiver;
    }

    public void execute() {
        this.receiver.doSomething();
    }
}
