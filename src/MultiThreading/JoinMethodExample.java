package MultiThreading;

public class JoinMethodExample extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("child Thread : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {

        JoinMethodExample je = new JoinMethodExample();
        je.start();
        je.join();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("main Thread : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
