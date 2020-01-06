package 责任链模式;

public class Middle extends  Handler {

    protected void response(IRequest request) {
        System.out.println("--------难度级别为2的请求-------");
        System.out.println(request.getRequest());
        System.out.println("中级工程师处理结果: 已处理\n");
    }

    Middle(){
        super(Handler.Difficulty_LEVEL_2_REQUEST);
    }
}
