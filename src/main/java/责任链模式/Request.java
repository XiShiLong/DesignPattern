package 责任链模式;

public class Request implements IRequest {

    /**
     * 难度级别1--初级工程师解决
     * 难度级别2--中级工程师解决
     * 难度级别3--高级工程师解决
     */
    private int level;//请求级别
    private String request="";//请求内容

    Request(int level,String request){
        this.level=level;
        switch (this.level){
            case 1:
                this.request = "难度级别为1的请求是：" + request;
                break;
            case 2:
                this.request = "难度级别为2的请求是：" + request;
                break;
            case 3:
                this.request = "难度级别为3的请求是：" + request;
                break;
        }
    }

    public int getRequestLevel() {
        return this.level;
    }

    public String getRequest() {
        return this.request;
    }
}
