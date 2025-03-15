package behavioral.observer;

public class User implements Subscriber{

    String name;
    String videoTitle;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String Video) {

        this.videoTitle=Video;
        System.out.println("📺 " + name + " received notification: New video uploaded - " + videoTitle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }
}
