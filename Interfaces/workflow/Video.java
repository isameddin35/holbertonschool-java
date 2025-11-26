public class Video {
    private String file;
    private FormatVideo formatVideo;

    public Video(String file, FormatVideo formatVideo) {
        this.file = file;
        this.formatVideo = formatVideo;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public FormatVideo getFormatVideo() {
        return formatVideo;
    }

    public void setFormatVideo(FormatVideo formatVideo) {
        this.formatVideo = formatVideo;
    }
}
