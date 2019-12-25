package 装饰器模式;

public class BarrageRedVideoPlay extends BarrageVideoPlay {

    public BarrageRedVideoPlay(MediaPlay mediaPlay){
        super(mediaPlay);
    }

    public String getMediaName() {
        return mediaPlay.getMediaName();
    }

    public int getMediaSeconds() {
        return mediaPlay.getMediaSeconds();
    }

    public String getMediaContent() {
        return "---+++*** " + mediaPlay.getMediaContent() + "（弹幕中）---+++***";
    }
}
