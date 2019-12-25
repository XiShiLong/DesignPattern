package 单例模式.懒汉式;

public class Singleton {

    //使用类变量来缓存创建过的实例
    private static volatile Singleton instance=null;//volatils保证线程同步

    //全局访问点
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
