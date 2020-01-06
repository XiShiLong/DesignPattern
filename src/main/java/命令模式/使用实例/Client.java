package 命令模式.使用实例;

//调用者
public class Client {
    public static void main(String[] args) {
        TV tv=new TV();
        Command openCommand=new OpenTvCommand(tv);
        Command changeCommand=new ChangeTvCommand(tv);
        Command closeCommand=new CloseTvCommand(tv);
        TvRemote tvRemote=new TvRemote(openCommand,changeCommand,closeCommand);
        tvRemote.open();
        tvRemote.change();
        tvRemote.close();
    }
}
