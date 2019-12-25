package 过滤器模式;

import java.util.List;

public interface Criteria {
    List<Rubbish> rubbishFilter( List<Rubbish> rubbishs);
}
