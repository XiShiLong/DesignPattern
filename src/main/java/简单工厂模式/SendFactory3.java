package 简单工厂模式;

import 工厂模式.ExpressSender;

public class SendFactory3 {
    public static ExpressSender produceExp(){
        return new ExpressSender();
    }

    public static SmsSender produceSms(){
        return new SmsSender();
    }
}
