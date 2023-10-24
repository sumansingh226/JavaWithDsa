package MultiThreading.RunnableInterface;

public class ThreadByRunnable {
 static class TestRunnable implements  Runnable
 {
     public  void run()
     {
         System.out.println("runnable run method ");
     }
 }

    public static void main(String[] args) {
     TestRunnable tr = new TestRunnable();
     Thread th = new Thread(tr);
     th.start();
    }
}
