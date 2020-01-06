package 责任链模式;

import 工厂模式.Sender;

public class Senior extends Handler {
    protected void response(IRequest request) {
        System.out.println("--------难度级别为3的请求-------");
        System.out.println(request.getRequest());
        System.out.println("高级工程师处理结果: 已处理\n");
    }

    Senior(){
        super(Handler.Difficulty_LEVEL_3_REQUEST);
    }
}
