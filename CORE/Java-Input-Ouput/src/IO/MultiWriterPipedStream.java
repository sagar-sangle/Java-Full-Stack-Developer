package IO;

import java.io.*;

public class MultiWriterPipedStream {
    public static void main(String[] args) throws IOException {
        PipedOutputStream writer1 = new PipedOutputStream();
        PipedOutputStream writer2 = new PipedOutputStream();

        // Connect multiple writers using SequenceInputStream
        PipedInputStream reader = new PipedInputStream();
        SequenceInputStream sis = new SequenceInputStream(
                new PipedInputStream(writer1),
                new PipedInputStream(writer2)
        );

        
        // Reader Thread
        Thread readerThread = new Thread(() -> {
            try {
                int data;
                while ((data = sis.read()) != -1) {
                    System.out.print((char) data);
                }
                sis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });



        // Writer 1 Thread
        Thread writerThread1 = new Thread(() -> {
            try {
                writer1.write("Hello from Writer 1\n".getBytes());
                writer1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Writer 2 Thread
        Thread writerThread2 = new Thread(() -> {
            try {
                writer2.write("Hello from Writer 2\n".getBytes());
                writer2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Start Threads
        readerThread.start();
        writerThread1.start();
        writerThread2.start();
    }
}
