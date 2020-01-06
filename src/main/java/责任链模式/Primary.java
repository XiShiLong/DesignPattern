package 责任链模式;

import java.lang.reflect.Proxy;

public class Primary extends Handler {
    protected void response(IRequest request) {
        System.out.println("--------难度级别为1的请求-------");
        System.out.println(request.getRequest());
        System.out.println("初级工程师处理结果: 已处理\n");
    }
   //请求难度为1
   Primary(){
        super(Handler.Difficulty_LEVEL_1_REQUEST);
   }


}
