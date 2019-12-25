package 装饰器模式;

public class ThreeDRedVideoPlay extends ThreeDVideoPlay {

    public ThreeDRedVideoPlay(MediaPlay mediaPlay){
        super(mediaPlay);
    }

    public String getMediaName() {
        return this.mediaPlay.getMediaName();
    }

    public int getMediaSeconds() {
        return this.mediaPlay.getMediaSeconds();
    }

    public String getMediaContent() {
        return "3D play"+this.mediaPlay.getMediaContent();
    }
}
