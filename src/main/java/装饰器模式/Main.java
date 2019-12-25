package 装饰器模式;

public class Main {
    public static void main(String[] args) {
        MediaPlay mediaPlay = new VideoPlay("射雕英雄传", "郭靖大战欧阳锋");
        MediaPlay mediaPlay1=new BarrageRedVideoPlay(mediaPlay);
        mediaPlay.play();
        mediaPlay1.play();

        MediaPlay mediaPlay2=new ThreeDRedVideoPlay(mediaPlay);
        mediaPlay2.play();
    }
}
