package 命令模式.使用实例;

//遥控器
public class TvRemote {
    private Command openTvCommand;
    private Command changeTvCommand;
    private Command closeTvCommand;

    public TvRemote(Command opCommand,Command changeCommand,Command closeCommand){
        this.openTvCommand=opCommand;
        this.changeTvCommand=changeCommand;
        this.closeTvCommand=closeCommand;
    }

    //开按钮
    public void open(){
        this.openTvCommand.execute();
    }

    //换频道按钮
    public void change(){
        this.changeTvCommand.execute();
    }

    //关按钮
    public void close(){
        this.closeTvCommand.execute();
    }
}
