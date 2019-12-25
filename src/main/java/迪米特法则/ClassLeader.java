package 迪米特法则;

import java.util.List;

public class ClassLeader {
    public static class Girl{

    }
    private List<Girl> girls;

    public ClassLeader(List<Girl> girls){
        this.girls=girls;
    }

    public int countGirls(){
        return this.girls.size();
    }
}
