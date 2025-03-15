package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel{

    private List<Subscriber> subscribers = new ArrayList<>();
    private String channelName;

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Subscriber subscriber) {

        subscribers.add(subscriber);
        System.out.println("✅ " + ((User) subscriber).getName() + " subscribed to " + channelName);

    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("❌ " + ((User) subscriber).getName() + " unsubscribed from " + channelName);

    }

    @Override
    public void notifySubscribers(String videoTitle) {

        System.out.println("\n📢 " + channelName + " uploaded a new video: " + videoTitle);
        for (Subscriber subscriber : subscribers) {
            subscriber.update(videoTitle);
        }

    }
}
