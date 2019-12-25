package 工厂模式;

import 工厂模式.factory.EmailProductor;
import 工厂模式.factory.ExpressProductor;
import 工厂模式.factory.Productor;
import 工厂模式.factory.SmsProductor;

public class app {

    public static void main(String [] args){
        Productor emailP=new EmailProductor();
        Productor expressP=new ExpressProductor();
        Productor smsP=new SmsProductor();

        Sender ems= emailP.product();
        Sender eps=expressP.product();
        Sender sms=smsP.product();

        ems.send();
        eps.send();
        sms.send();
    }
}
