package 责任链模式;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //设置任务链
        ArrayList<IRequest> requests=new ArrayList<IRequest>();
        requests.add(new Request(Handler.Difficulty_LEVEL_1_REQUEST,"1+1=?"));
        requests.add(new Request(Handler.Difficulty_LEVEL_2_REQUEST,"1+2=?"));
        requests.add(new Request(Handler.Difficulty_LEVEL_3_REQUEST,"1+3=?"));
        requests.add(new Request(4, "765343/767*232=？"));
        Handler handler1=new Primary();
        Handler handler2=new Middle();
        Handler handler3=new Senior();

        //组装处理链
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        for(IRequest req:requests){
            // 责任链中处理该请求
            handler1.HandleMessage(req);
        }
    }
}
