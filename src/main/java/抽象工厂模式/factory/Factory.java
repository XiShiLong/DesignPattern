package 抽象工厂模式.factory;

import 抽象工厂模式.product.Refrigerator;
import 抽象工厂模式.product.Television;

public interface Factory {
    public Television newTelevision();
    public Refrigerator newRefrigerator();
}
