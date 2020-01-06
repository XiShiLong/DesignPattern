package 命令模式.使用实例;

class OpenTvCommand implements Command{
    private TV tv;
    public OpenTvCommand(TV tv){
        this.tv=tv;
    }

    public void execute() {
        tv.open();
    }
}

class ChangeTvCommand implements Command{
    private TV tv;
    public ChangeTvCommand(TV tv) {
        this.tv=tv;
    }

    public void execute() {
        tv.change();
    }
}

class CloseTvCommand implements Command{
    private TV tv;
    public CloseTvCommand(TV tv){
        this.tv=tv;
    }

    public void execute() {
        tv.close();
    }
}


