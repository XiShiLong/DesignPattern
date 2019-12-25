package 抽象工厂模式.factory;

import 抽象工厂模式.product.Refrigerator;
import 抽象工厂模式.product.TCLRefrigerator;
import 抽象工厂模式.product.TCLTelevision;
import 抽象工厂模式.product.Television;

public class TCLFactory implements Factory{
    public Refrigerator newRefrigerator() {
        return new TCLRefrigerator();
    }

    public Television newTelevision() {
        return new TCLTelevision();
    }
}
