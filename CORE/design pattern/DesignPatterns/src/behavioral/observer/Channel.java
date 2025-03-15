package behavioral.observer;

import java.util.List;

public interface Channel {

    public void subscribe(Subscriber subscriber);
    public void unSubscribe(Subscriber subscriber);
    public void notifySubscribers(String video);


}
