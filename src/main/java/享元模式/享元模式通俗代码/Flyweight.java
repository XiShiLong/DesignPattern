package 享元模式.享元模式通俗代码;

/*
* 抽象xiang
* */
public abstract class Flyweight {
    //内部状态
    private String intrinstic;

    //外部状态
    protected final String extrinsic;

    public Flyweight(String extrinsic){
        this.extrinsic=extrinsic;
    }

    //定义的业务操作
    public abstract void operate();

    //内部状态的getter、setter
    public String getIntrinstic(){
        return this.intrinstic;
    }

    public void setIntrinstic(String intrinstic){
        this.intrinstic=intrinstic;
    }
}
