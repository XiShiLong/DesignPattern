package 简单工厂模式;

import 工厂模式.ExpressSender;

//多方法简单工厂
public class SendFactory2 {
    public ExpressSender produceExp(){
        return new ExpressSender();
    }

    public SmsSender produceSms(){
        return new SmsSender();
    }
}

