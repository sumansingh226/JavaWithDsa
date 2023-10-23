package MultiThreading.Threads;

public class ThreadExample  extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread is running: " + i);
            }
        }

        public static  void main(String[] args) {
            ThreadExample myThread = new ThreadExample();
            myThread.start();
        }
    }


