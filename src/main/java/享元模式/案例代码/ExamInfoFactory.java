package 享元模式.案例代码;

import java.util.HashMap;

public class ExamInfoFactory {

    //对象池，用来支持细粒度对象的复用
    private static HashMap<String,ExamInfo> pool=new HashMap<String, ExamInfo>();

    public static ExamInfo getExamInfo(String subject){
        ExamInfo examInfo=null;
        if (!pool.containsKey(subject)){//如果不包含该科目的对象
            //创建对象并放进池子中
            System.out.println("池子中不包含该对象，我们为您创建该对象后返回");
            examInfo=new ExamInfo(subject);
            pool.put(subject,examInfo);
            return examInfo;
        }else{
            System.out.println("池子中包含该对象，不用创建直接返回");
            return pool.get(subject);
        }
    }
}
