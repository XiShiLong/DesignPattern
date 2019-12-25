package 桥接模式.phone;

import 桥接模式.soft.SoftImplementor;

public class MiMobilePhone extends MobilePhoneAbstraction {

    public MiMobilePhone(SoftImplementor imp){
        super(imp);
    }

    public void run() {
        this.implementor.rawrun();
    }

    public void gpuTurborRun(){
        System.out.println("GPU Turbo Running start...");
        this.run();
        System.out.println("GPU Turbo Running end...");
    }
}
