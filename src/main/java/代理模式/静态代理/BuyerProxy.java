package 代理模式.静态代理;

public class BuyerProxy implements IBuyer {

    //把购票类传进来由黄牛代理
    private IBuyer buyer;

    public BuyerProxy(IBuyer iBuyer){
        this.buyer=iBuyer;
    }

    public void login(String username, String password) {//黄牛代理登录
        this.buyer.login(username,password);
    }

    public void buyTickeet() {
        before();
        this.buyer.buyTickeet();
        after();
    }

    private void before() {
        System.out.println("开始为用户刷票");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void after(){
        System.out.println("刷票完成");
    }
}
