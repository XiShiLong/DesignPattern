package 外观模式.使用外观模式;


public class Facade {
    //被委托的对象
    private FireSystem fireSystem;
    private UserSystem userSystem;

    public Facade(FireSystem fireSystem,UserSystem userSystem){
        this.fireSystem=fireSystem;
        this.userSystem=userSystem;
    }
    //模拟设计的门面接口
    public void shooting(){
        this.fireSystem.fire();
        this.fireSystem.useBullet();
        this.userSystem.loseBlood();
        this.userSystem.addScore();
    }

}
