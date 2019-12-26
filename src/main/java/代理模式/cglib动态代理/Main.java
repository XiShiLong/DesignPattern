package 代理模式.cglib动态代理;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        String name="calya";
        final Ticketer buyer=new Ticketer(name);
        final String [] fargs=args;
        // 工具类
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(buyer.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object obj;
                //这里我们在 bugTicket 操作前后进行通知操作，来模拟 BuyerProxy
                if ("bugTicket".equals(method.getName())){
                    System.out.println("准备定时任务，开始刷票");
                    obj=method.invoke(buyer,fargs);
                    System.out.println("刷票成功，短信通知客户");
                }else{
                    obj=method.invoke(buyer,objects);
                }
                return obj;
            }
        });

        Ticketer ticketerProxy=(Ticketer)enhancer.create();//创建子类（代理对象）
        ticketerProxy.login(name,"1234");
        ticketerProxy.bugTicket();
    }

}
