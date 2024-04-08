class Counter {
    int count;

    // synchronized code
    public synchronized void increment() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // make one object increment count 1000 times
        Counter c1 = new Counter();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c1.increment();
                }
            }
        });

        // make new object
        Counter c2 = new Counter();
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c2.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("The value of count for c1: " + c1.count);
        System.out.println("The value of count for c2: " + c2.count);
    }
}
