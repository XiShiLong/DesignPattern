package 工厂模式.factory;

import 工厂模式.Sender;
import 工厂模式.SmsSender;

public class SmsProductor implements Productor {
    public Sender product() {
        return new SmsSender();
    }
}
