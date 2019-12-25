package 享元模式.案例代码;

public class Main {
    public static void main(String[] args) {
       for(int i=0;i<2;i++){
           String subject="科目"+i;
           ExamInfoFactory.getExamInfo(subject);
       }
       //假设3个考生考试
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                ExamInfo examInfo=ExamInfoFactory.getExamInfo("科目"+j);
                examInfo.setUser("考生"+i);
                System.out.println(examInfo);
            }
        }
    }
}
