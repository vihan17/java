package Assignment10;

public class MyThreadextendsThread extends Thread {

    public void run() {
        // This method will be executed in a separate thread when start() is called
        System.out.println("MyThread is running...");
    }

    public static void main(String[] args) {
        // Create a new instance of MyThread
        MyThreadextendsThread myThread = new MyThreadextendsThread();

        // Start the thread by calling its start() method
        myThread.start();

        // Wait for the thread to finish by calling its join() method
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the thread is still alive by calling its isAlive() method
        if (myThread.isAlive()) {
            System.out.println("MyThread is still running...");
        } else {
            System.out.println("MyThread has finished running.");
        }
    }
}

