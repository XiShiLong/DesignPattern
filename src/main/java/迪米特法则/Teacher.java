package 迪米特法则;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    public static void Command(ClassLeader classLeader){
        System.out.println("the number of girl is "+classLeader.countGirls());
    }

    public static void main(String[] args) {
        List<ClassLeader.Girl> girls=new ArrayList<ClassLeader.Girl>();
        girls.add(new ClassLeader.Girl());
        Teacher.Command(new ClassLeader(girls));
    }
}
