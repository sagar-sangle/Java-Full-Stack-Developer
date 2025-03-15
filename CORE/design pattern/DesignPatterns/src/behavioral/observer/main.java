/*
🔹 Observer Design Pattern (Behavioral Pattern)
🔸 What is the Observer Pattern?
The Observer Pattern defines a one-to-many dependency between objects, where one object (Subject) notifies multiple dependent objects (Observers)
when its state changes.

This pattern is useful when changes in one object need to be reflected in multiple others without tightly coupling them.

🔹 Key Features of the Observer Pattern
✅ One-to-many dependency: One subject notifies multiple observers.
✅ Loose coupling: The subject doesn’t need to know details about its observers.
✅ Automatic updates: Observers get notified when the subject's state changes.
✅ Scalability: Easy to add/remove observers without modifying the subject.

🔹 Real-World Example: YouTube Notifications 📢
A YouTube Channel (Subject) notifies all Subscribers (Observers) when a new video is uploaded.
If a subscriber unsubscribes, they stop receiving notifications.
 */

package behavioral.observer;

public class main {

    public static void main(String[] args) {

        YoutubeChannel codeByte = new YoutubeChannel("CODE BYTE");


        User sagarSangle = new User("sagar sangle");
        User deepakUmap = new User("deepak umap");
        User tyagiBhai = new User("Tyagi Bhai");

        codeByte.subscribe(sagarSangle);
        codeByte.subscribe(deepakUmap);

        codeByte.notifySubscribers("Learn Desgin Pattern");
        codeByte.subscribe(tyagiBhai);

        codeByte.unSubscribe(sagarSangle);



    }
}
