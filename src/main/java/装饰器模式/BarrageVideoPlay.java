package 装饰器模式;

public abstract class BarrageVideoPlay extends MediaPlay{
    protected MediaPlay mediaPlay;

    public BarrageVideoPlay(MediaPlay mediaplay){
        this.mediaPlay=mediaplay;
    }
}
