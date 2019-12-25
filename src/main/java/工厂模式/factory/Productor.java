package 工厂模式.factory;

import 工厂模式.EmailSender;
import 工厂模式.ExpressSender;
import 工厂模式.Sender;
import 工厂模式.SmsSender;

public interface Productor {
    public  Sender product();
}
