package 工厂模式.factory;

import 工厂模式.ExpressSender;
import 工厂模式.Sender;

public class ExpressProductor implements Productor {
    public Sender product() {
        return new ExpressSender();
    }
}
