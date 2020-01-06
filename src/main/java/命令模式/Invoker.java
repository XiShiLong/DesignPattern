package 命令模式;

public class Invoker {
    //持有命令对象
    private Command command;
    public Invoker(Command command){
        this.command=command;
    }

    //请求方法
    public void action(){
        this.command.execute();
    }
}
