package 代理模式.jdk动态代理;

import 代理模式.静态代理.Buyer;
import 代理模式.静态代理.IBuyer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        String name="caiya";
        final IBuyer buyer=new Buyer(name);

        // 使用jdk 代理类完成 BuyerProxy 操作，重点是如何实现前置后置通知
        IBuyer proxy=(IBuyer) Proxy.newProxyInstance(buyer.getClass().getClassLoader(), buyer.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object obj;
                // 这里我们在 bugTicket 操作前后进行通知操作，来模拟 BuyerProxy
                if("buyTickeet".equals(method.getName())){
                    System.out.println("准备定时任务，开始刷票");
                    obj=method.invoke(buyer,args);
                    System.out.println("刷票成功，短信通知客户");
                }else{
                    obj=method.invoke(buyer,args);
                }
                return obj;
            }
        });
        proxy.buyTickeet();
    }
}
