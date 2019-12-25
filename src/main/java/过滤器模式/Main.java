package 过滤器模式;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 原始数据集合
        List<Rubbish> rubbishList = new ArrayList<Rubbish>();
        rubbishList.add(new Rubbish("果壳", false, false, true, false));
        rubbishList.add(new Rubbish("陶瓷", false, false, true, false));
        rubbishList.add(new Rubbish("菜根菜叶", false, false, false, true));
        rubbishList.add(new Rubbish("果皮", false, false, false, true));
        rubbishList.add(new Rubbish("水银温度计", true, false, false, false));
        rubbishList.add(new Rubbish("电池", true, false, false, false));
        rubbishList.add(new Rubbish("灯泡", true, false, false, false));
        rubbishList.add(new Rubbish("废纸塑料", false, true, false, false));
        rubbishList.add(new Rubbish("金属和布料", false, true, false, false));
        rubbishList.add(new Rubbish("玻璃", false, true, false, false));

        // 四种不同的过滤标准
        Criteria dryRubbishCriteria = new DryRubbishCriteria();
        Criteria wetRubbishCriteria = new WetRubbishCriteria();
        Criteria harmfulRubbishCriteria = new HarmfulRubbishCriteria();
        Criteria recycledRubbishCriteria = new RecycledRubbishCriteria();

        System.out.println("湿垃圾: ");
        printRubbishes(wetRubbishCriteria.rubbishFilter(rubbishList));

        System.out.println("有害垃圾: ");
        printRubbishes(harmfulRubbishCriteria.rubbishFilter(rubbishList));

        System.out.println("可回收垃圾: ");
        printRubbishes(recycledRubbishCriteria.rubbishFilter(rubbishList));
    }

    private static void printRubbishes(List<Rubbish> rubbishes) {
        for (Rubbish rubbish: rubbishes) {
            System.out.println(rubbish);
        }
    }
}
