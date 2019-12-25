package 享元模式.案例代码;

public class ExamInfo {
    //内部状态，用于在各个对象之间共享，不随着环境改变而改变，存储在享元对象内部，往往作为对象的动态附加信息存在
    private String user;//考生
    //外部状态，随环境改变而改变，属于不可共享的状态，是对象得以依赖的一个标记
    private String subject;//考试科目

    public ExamInfo(String subject){
        this.subject=subject;
    }

    public String getUser(){
        return this.user;
    }

    public void setUser(String user){
        this.user=user;
    }

    public String toString() {
        return "ExamInfo{" +
                "user='" + user + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
