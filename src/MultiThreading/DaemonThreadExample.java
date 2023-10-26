package MultiThreading;

public class DaemonThreadExample {


    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            System.out.println("daemon Thread");
        });
        daemonThread.setDaemon(true);  // set a normal Thread as daemon Thread
        System.out.println("is Thread daemon Thread : " + daemonThread.isDaemon());
    }
}
