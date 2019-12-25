package 抽象工厂模式;

import 抽象工厂模式.factory.Factory;
import 抽象工厂模式.factory.HaiErFactory;
import 抽象工厂模式.factory.MeiDiFactory;
import 抽象工厂模式.factory.TCLFactory;
import 抽象工厂模式.product.Refrigerator;
import 抽象工厂模式.product.Television;

public class test {
    public static void main(String[] args) {
        Factory tclFactory=new TCLFactory();
        Refrigerator tclRefrigerator=tclFactory.newRefrigerator();
        Television tclTelevision=tclFactory.newTelevision();

        tclRefrigerator.store();
        tclTelevision.play();


        Factory meiDiFactory=new MeiDiFactory();
        Refrigerator meiDiRefrigerator=meiDiFactory.newRefrigerator();
        Television meiDiTelevision=meiDiFactory.newTelevision();

        meiDiRefrigerator.store();
        meiDiTelevision.play();

        Factory haiErFactory=new HaiErFactory();
        Refrigerator haiErRefrigerator=haiErFactory.newRefrigerator();
        Television haiErTelevision=haiErFactory.newTelevision();

        haiErRefrigerator.store();
        haiErTelevision.play();
    }
}
