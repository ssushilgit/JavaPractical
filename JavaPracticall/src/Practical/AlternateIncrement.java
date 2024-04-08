package Practical;
class SharedResource {
    private int counter = 0;

    public synchronized void increment() {
        while (counter % 2 != 0) {
            // Wait for the other thread to finish its turn
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        counter++;
        System.out.println(Thread.currentThread().getName() + " increments counter to: " + counter);
        notify(); // Notify the waiting thread
    }
}

class IncrementThread implements Runnable {
    private SharedResource sharedResource;

    public IncrementThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.increment();
        }
    }
}

public class AlternateIncrement {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(new IncrementThread(sharedResource), "Thread1");
        Thread thread2 = new Thread(new IncrementThread(sharedResource), "Thread2");

        thread1.start();
        thread2.start();
    }
}

