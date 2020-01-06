package 命令模式.使用实例;

public class TV {//接收命令的对象

    public void open(){
        System.out.println("打开电视");
    }

    public void change(){
        System.out.println("换频道");
    }
    public void close(){
        System.out.println("关闭电视");
    }
}
