import java.util.ArrayList;
import java.util.List;

public class VideoProcessor {
    private List<NotificationChannel> channels = new ArrayList<>();

    public void registerChannel(NotificationChannel notificationChannel) {
        channels.add(notificationChannel);
    }

    public void process(Video video) {
        Message message = new Message();
        message.setMessageType(MessageType.LOG);
        message.setText(video.getFile() + " - " + video.getFormatVideo());
        for (NotificationChannel channel : channels) {
            channel.notify(message);
        }
    }
}
