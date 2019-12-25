package 装饰器模式;

public abstract class ThreeDVideoPlay extends MediaPlay{
    protected MediaPlay mediaPlay;
    public ThreeDVideoPlay(MediaPlay mediaPlay){
        this.mediaPlay=mediaPlay;
    }
}
