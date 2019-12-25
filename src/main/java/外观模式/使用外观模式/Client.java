package 外观模式.使用外观模式;

public class Client {
    public static void main(String[] args) {
        FireSystem fireSystem=new FireSystem();
        UserSystem userSystem=new UserSystem();
        Facade facade=new Facade(fireSystem,userSystem);
        facade.shooting();
    }
}
