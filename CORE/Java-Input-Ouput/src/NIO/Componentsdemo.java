package NIO;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Componentsdemo {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(20);
        buffer.put((byte)20);
        buffer.put((byte)30);
        buffer.put((byte)40);
        buffer.put((byte)50);
        buffer.put((byte)60);
        buffer.put((byte)70);

        buffer.flip(); // Switch to read mode

        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }

        buffer.rewind(); // Rewind for re-reading
        System.out.println(buffer.get());

        System.out.println("Using channel to write data into a file...");

        try (FileOutputStream fos = new FileOutputStream("src/childFolder/sample1/niodemo.txt");
             FileChannel channel = fos.getChannel()) {

            ByteBuffer buff = ByteBuffer.allocate(1024);
            buff.put("hi this is nio Channel !".getBytes());

                    /*
            How Buffers Work
A ByteBuffer has three main pointers:

Position → Current writing/reading index
Limit → Marks the boundary up to which we can read or write
Capacity → Total buffer size
Initially, when we put data into the buffer using buffer.put(data), it is in write mode, meaning:

position moves forward as data is added.
limit stays at buffer capacity.
capacity is fixed.

Before we can read from it (or send it to a channel), we must switch to "read mode".
This is where flip() comes in.

📝 What flip() Does
When we call flip(), it:
✔ Sets limit = position (so we only read written data).
✔ Resets position = 0 (so we start reading from the beginning).


             */
                    /*
            Without flip() (Wrong)
java
Copy
Edit
ByteBuffer buffer = ByteBuffer.allocate(1024);
buffer.put("Hello".getBytes());  // Position moves forward
fileChannel.write(buffer); // ❌ Won't work correctly
             */
            buff.flip(); // Switch to read mode before writing
            channel.write(buff);
            System.out.println("Data written successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from file using FileChannel
        try (FileInputStream fis = new FileInputStream("src/childFolder/sample1/niodemo.txt");
             FileChannel channel = fis.getChannel()) {

            ByteBuffer buff = ByteBuffer.allocate(1024);
            buff.clear(); // Ensure buffer is ready for writing
            channel.read(buff);

            buff.flip(); // Switch to read mode
            byte[] data = new byte[buff.remaining()];
            buff.get(data);
            System.out.println("Reading from buffer: " + new String(data));

        } catch (IOException e) {
            e.printStackTrace();
        }


        //A Selector in Java NIO allows a single thread to manage multiple channels efficiently. It's a crucial feature for high-performance servers like chat applications, web servers, and real-time systems.
    }
}
