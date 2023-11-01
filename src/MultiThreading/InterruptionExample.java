package MultiThreading;

public class InterruptionExample extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " ie.isInterrupted() : " + Thread.currentThread().isInterrupted());
                System.out.println("i is : " + i);
                if (i == 3) {
                    Thread.currentThread().interrupt();
                    Thread.sleep(1000);

                }

                System.out.println(Thread.currentThread().getName() + " ie.isInterrupted() : " + Thread.currentThread().isInterrupted());

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        InterruptionExample ie = new InterruptionExample();
        ie.start();
        System.out.println(Thread.currentThread().getName() + " is  : " + Thread.currentThread().isInterrupted());

        System.out.println(Thread.currentThread().getName() + " is  : " + Thread.currentThread().isInterrupted());

    }
}
