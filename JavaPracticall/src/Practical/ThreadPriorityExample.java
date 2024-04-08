package Practical;

class MyThread extends Thread {
    public MyThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
class ThreadPriorityExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread-1", Thread.MIN_PRIORITY);
        MyThread thread2 = new MyThread("Thread-2", Thread.NORM_PRIORITY);
        MyThread thread3 = new MyThread("Thread-3", Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
