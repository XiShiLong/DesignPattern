package 享元模式.享元模式通俗代码;

import java.util.HashMap;

public class FlyweightFactory {

    //池容器
    private static HashMap<String,Flyweight> pool=new HashMap<String, Flyweight>();

    //获取池中对象
    public static Flyweight getFlyweight(String extrinsic){
        //需要返回的对象
        Flyweight flyweight=null;
        if(!pool.containsKey(extrinsic)){
            flyweight=new ConcreteFlyweight(extrinsic);
            pool.put(extrinsic,flyweight);
        }else{
            flyweight=pool.get(extrinsic);
        }
        return flyweight;
    }
}
