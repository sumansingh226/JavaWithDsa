package MultiThreading;

public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        daemonThread.setDaemon(true);
        daemonThread.start();

        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is exiting");
    }
}
