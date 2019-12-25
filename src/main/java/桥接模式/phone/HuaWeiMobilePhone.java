package 桥接模式.phone;

import 桥接模式.soft.SoftImplementor;

public class HuaWeiMobilePhone extends MobilePhoneAbstraction {

    public HuaWeiMobilePhone(SoftImplementor impl){
        super(impl);
    }

    public void run() {
        //使用委托，调用HuaWeiMo
        this.implementor.rawrun();
    }

    public void gpuTurborRun(){
        System.out.println("GPU Turbo Running start...");
        this.run();
        System.out.println("GPU Turbo Running end...");
    }
}
