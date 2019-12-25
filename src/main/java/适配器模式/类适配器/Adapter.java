package 适配器模式.类适配器;

public class Adapter extends Adaptee implements Target {

    public void targetMethod1() {
        System.out.println("Adapter targetMethod1 inkoked");
        methodA();
    }

    public void targetMethod2() {
        System.out.println("Adapter targetMethod2 inkoked");
        methodB();
    }
}
