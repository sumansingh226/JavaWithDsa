package MultiThreading.Synchronization;

public class StaticSynchronizationExample {

    private static int counter = 0;

    public static synchronized void incrementCounter() {
        for (int i = 0; i < 5; i++) {
            counter++;
            System.out.println(Thread.currentThread().getName() + " - Counter: " + counter);
        }
    }

    public static void main(String[] args) {
        Runnable task = () -> {
            incrementCounter();
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
