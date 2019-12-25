package 过滤器模式;

import java.util.ArrayList;
import java.util.List;

public class HarmfulRubbishCriteria implements  Criteria{

    public List<Rubbish> rubbishFilter(List<Rubbish> rubbishs) {
        List<Rubbish> rubbishList = new ArrayList<Rubbish>();
        for (Rubbish rubbish: rubbishs) {
            // 这里只过滤出所有有害垃圾
            if (rubbish.isHarm()) {
                rubbishList.add(rubbish);
            }
        }
        return rubbishList;
    }
}
