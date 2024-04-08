package Practical;

class PrintNumbers implements Runnable {
    private int start;
    private int end;
    private int step;

    public PrintNumbers(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i += step) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class EvenOddNumbers {
    public static void main(String[] args) {
        // Create two threads
        Thread evenThread = new Thread(new PrintNumbers(2, 10, 2), "EvenThread");
        Thread oddThread = new Thread(new PrintNumbers(1, 10, 2), "OddThread");

        // Start the threads
        evenThread.start();
        oddThread.start();
    }
}
