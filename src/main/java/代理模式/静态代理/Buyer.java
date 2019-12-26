package 代理模式.静态代理;

public class Buyer implements IBuyer {

    private String name;//模拟当前购票人

    public Buyer(String name){
        this.name=name;
    }

    public void login(String username, String password) {
        System.out.println("用户：" + username + " 使用密码：" + password + " 已登录成功");
    }

    public void buyTickeet() {
        System.out.println(name + " 正在购票");
    }
}
