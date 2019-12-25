package 工厂模式.factory;

import 工厂模式.Sender;

public class ExpressSender implements Productor {
    public Sender product() {
        return new 工厂模式.ExpressSender();
    }
}
