package 抽象工厂模式.factory;

import 抽象工厂模式.product.MeiDiRefrigerator;
import 抽象工厂模式.product.MeiDiTelevision;
import 抽象工厂模式.product.Refrigerator;
import 抽象工厂模式.product.Television;

public class MeiDiFactory implements Factory {
    public Television newTelevision() {
        return new MeiDiTelevision();
    }

    public Refrigerator newRefrigerator() {
        return new MeiDiRefrigerator();
    }
}
