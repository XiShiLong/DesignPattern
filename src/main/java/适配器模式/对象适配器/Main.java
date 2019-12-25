package 适配器模式.对象适配器;

import 适配器模式.对象适配器.Adapter;
import 适配器模式.对象适配器.Target;

public class Main {
    public static void main(String[] args) {
        Target target=new Adapter();
        target.targetMethod1();
        target.targetMethod2();
    }
}
