package 装饰器模式;

public abstract class MediaPlay {
    public abstract String getMediaName();
    public abstract int getMediaSeconds();
    public abstract String getMediaContent();

    public final void play(){
        System.out.print("Media：" + getMediaName() + "(累计时长：" + getMediaSeconds() + " 秒) 正在播放");
        try{
            for(int i=1;i<=getMediaSeconds();i++){
                Thread.sleep(1000);
                System.out.println("当前播放第 " + i + " 秒，" + getMediaContent() + "...");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
