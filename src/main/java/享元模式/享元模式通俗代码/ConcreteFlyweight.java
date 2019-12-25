package 享元模式.享元模式通俗代码;

public class ConcreteFlyweight extends Flyweight{
    public void operate() {
        //具体业务逻辑
    }

    public ConcreteFlyweight(String extrinsic){
        super(extrinsic);
    }

}
