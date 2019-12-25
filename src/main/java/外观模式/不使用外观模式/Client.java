package 外观模式.不使用外观模式;

public class Client {
    public static void main(String[] args) {
        FireSystem fireSystem=new FireSystem();
        UserSystem userSystem=new UserSystem();

        fireSystem.fire();
        fireSystem.useBullet();
        userSystem.loseBlood();
        userSystem.addScore();
    }
}
