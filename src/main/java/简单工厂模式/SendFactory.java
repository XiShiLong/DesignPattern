package 简单工厂模式;

import 简单工厂模式.ExpressSender;

//简单工厂
public class SendFactory {
    public Sender Produce(String type){
        if(type=="ExpressSender"){
            return new ExpressSender();
        }
        if(type=="SmsSender"){
            return new SmsSender();
        }
        return null;
    }

    public static void main(String [] args){
        SendFactory sendFactory=new SendFactory();
        Sender expressSender=sendFactory.Produce("ExpressSender");
        Sender smsSender=sendFactory.Produce("SmsSender");
        expressSender.send();
        smsSender.send();
    }
}
