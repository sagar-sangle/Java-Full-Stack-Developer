

/*
✅ What is the Singleton Pattern?
The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it. This is achieved by:

Private constructor (Prevents external instantiation)
Static instance variable (Holds the single instance)
Public method (Provides controlled access to the instance)

✅ Why Use the Singleton Pattern?
✔ Prevent multiple instances (Useful for shared resources like database connections, logging, etc.)
✔ Save memory (Avoid unnecessary object creation)
✔ Ensure consistency (Only one object controls the system state)
✔ Thread safety (Ensures controlled access in multi-threaded applications)

✅ Benefits of Singleton Pattern
🔹 Ensures a single instance – Prevents duplication of expensive objects.
🔹 Global access point – Provides a central way to access an object.
🔹 Efficient resource management – Ideal for database connections, caching, and configuration settings.
🔹 Thread safety – Proper implementation prevents concurrency issues.
🔹 Prevents reflection & serialization attacks – Especially when using enum-based Singleton.

 */
package creational.singleton;






class Provider{





    public static Provider provider;


    private Provider(){


    }


    public static Provider getProvider() {
        if (provider == null) {
            synchronized (Provider.class) {
                if (provider == null) {
                    provider = new Provider();
                }
            }
        }
        return provider;
    }

    public String provide(String msg){

        return msg;

    }



}

public class main {

    public static void main(String[] args) {

        Provider provider = Provider.getProvider();
        provider.provide("session Factory");



    }
}
