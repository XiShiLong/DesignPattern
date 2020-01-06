package 责任链模式;

public abstract class Handler {
    final static int Difficulty_LEVEL_1_REQUEST = 1; // 难度级别为1
    final static int Difficulty_LEVEL_2_REQUEST = 2; // 难度级别为2
    final static int Difficulty_LEVEL_3_REQUEST = 3; // 难度级别为3
    //能处理的级别
    private int level=0;
    //传递责任，下一个责任人是谁
    private Handler nextHandler;
    //每个类都要说明下自己能处理哪些请求
    Handler(int level){
        this.level=level;
    }
    // 负责Request的请求处理，final关键字声明不允许被子类覆盖
    final void HandleMessage(IRequest request){
        //如果请求级别小于处理的级别就直接处理，比如：高级工程师也可以处理难度级别为1的请求
        if(request.getRequestLevel()<=this.level){
            this.response(request);
        }else{//无后续环节了，按照不同意处理
            if(this.nextHandler!=null){//有后续环节，请求传递
                this.nextHandler.HandleMessage(request);
            }else{//无后续环节，按照不同意处理
                System.out.println("--------难度级别为" + request.getRequestLevel() + "的请求-------");
                System.out.println("---抱歉，没有工程师可以处理---\n");
            }
        }
    }
    // 如果不属于你处理的请求，你应该让请求路由到下一个环节的责任人
    void setNextHandler(Handler nextHandler){
        this.nextHandler=nextHandler;
    }
    //对任务的响应
    protected abstract void response(IRequest request);
}



