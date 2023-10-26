package MultiThreading;

public class DaemonThreadExample extends  Thread {
     public  void run()
     {
         System.out.println("Demon Thread");
     }

    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            System.out.println("daemon Thread");
        });
        daemonThread.setDaemon(true);  // set a normal Thread as daemon Thread
        System.out.println("is Thread daemon Thread : " + daemonThread.isDaemon());

        DaemonThreadExample dte = new DaemonThreadExample();

        dte.setDaemon(true);  // set a normal Thread as daemon Thread
        dte.start();
        System.out.println("is Thread daemon Thread : " + dte.isDaemon());
    }
}
