package 过滤器模式;

import java.util.ArrayList;
import java.util.List;

public class DryRubbishCriteria  implements Criteria{

    public List<Rubbish> rubbishFilter(List<Rubbish> rubbishs) {
        List<Rubbish> rubbishList=new ArrayList<Rubbish>();
        for(Rubbish r : rubbishs){
            if(r.isDry()){
                rubbishList.add(r);
            }
        }
        return rubbishList;
    }
}
