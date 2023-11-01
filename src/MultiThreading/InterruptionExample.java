package MultiThreading;

public class InterruptionExample extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("i is : " + i);
                if (i == 3) {
                    Thread.sleep(1000);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        InterruptionExample ie = new InterruptionExample();
        ie.start();
        ie.interrupt();

    }
}
