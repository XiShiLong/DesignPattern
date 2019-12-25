package 抽象工厂模式.factory;

import 抽象工厂模式.product.HaiErRefrigerator;
import 抽象工厂模式.product.HaiErTelevision;
import 抽象工厂模式.product.Refrigerator;
import 抽象工厂模式.product.Television;

public class HaiErFactory implements Factory {

    public Television newTelevision() {
        return new HaiErTelevision();
    }

    public Refrigerator newRefrigerator() {
        return new HaiErRefrigerator();
    }
}
