package 桥接模式.phone;

import 桥接模式.soft.SoftImplementor;

public abstract class MobilePhoneAbstraction {
    protected SoftImplementor implementor;

    public abstract  void run();

    public MobilePhoneAbstraction(SoftImplementor impl){
        this.implementor=impl;
    }
}
