package 代理模式.静态代理;

public class Main {
    public static void main(String [] args){
        Buyer buyer=new Buyer("刘可");//购票者
        BuyerProxy bp=new BuyerProxy(buyer);//黄牛,黄牛代理购票者
        bp.login("刘可","123");
        bp.buyTickeet();
    }
}
