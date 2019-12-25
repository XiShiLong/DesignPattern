package 工厂模式.factory;

import 工厂模式.EmailSender;
import 工厂模式.Sender;

public class EmailProductor implements Productor {
    public Sender product() {
        return new EmailSender();
    }
}
