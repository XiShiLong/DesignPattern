package 适配器模式.对象适配器;

public class Adapter extends Target {

    //委托
    private Adaptee adaptee;

    public Adapter(){
        this.adaptee=new Adaptee();
    }

    public void targetMethod1() {
        System.out.println("adapter targetMethod1 inkoked");
        adaptee.methodA();
    }

    public void targetMethod2() {
        System.out.println("adapter targetMethod2 inkoked");
        adaptee.methodB();
    }
}
