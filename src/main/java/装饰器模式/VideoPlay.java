package 装饰器模式;

public class VideoPlay extends MediaPlay{

    private String videoContent; // 播放的视频内容
    private String videoName; // 播放的视频名称

    public VideoPlay(String videoName,String videoContent){
        this.videoContent=videoContent;
        this.videoName=videoName;
    }

    public String getMediaName() {
        return this.videoName;
    }//获取视频名称

    public int getMediaSeconds() {
        return videoContent.length();
    }//获取视频长度

    public String getMediaContent() {
        return this.videoContent;
    }//获取视频内容
}
