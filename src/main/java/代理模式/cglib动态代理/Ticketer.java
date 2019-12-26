package 代理模式.cglib动态代理;

public class Ticketer {
    private String name;//模拟当前购票人

    public Ticketer(String name){
        this.name=name;
    }

    public Ticketer(){

    }

    public void login(String username,String password){
        System.out.println("用户：" + username + " 使用密码：" + password + " 已登录成功");
    }

    public void bugTicket() {
        System.out.println(name + " 正在购票");
    }
}
