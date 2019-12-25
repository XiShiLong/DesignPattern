package 适配器模式.类适配器;

public class Main {
    public static void main(String[] args) {
        Target target=new Adapter();
        target.targetMethod1();
        target.targetMethod2();
    }
}
