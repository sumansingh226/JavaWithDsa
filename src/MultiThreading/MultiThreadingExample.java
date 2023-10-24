package MultiThreading;

public class MultiThreadingExample extends Thread {

    public void run() {
        System.out.println("Thread Start");
    }

    static class MultiThreadingExample1 extends Thread {
        {
            for (int i = 0; i < 10; i++) {
                if (i == 7) {
                    try {
                        sleep(10000);  // thread will sleep for 10sec
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("value of I " + i);
            }
        }
    }

    public static void main(String[] args) {

        MultiThreadingExample mte1 = new MultiThreadingExample();
        mte1.start();
        MultiThreadingExample1 mte2 = new MultiThreadingExample1();
        mte2.start();
    }

}
