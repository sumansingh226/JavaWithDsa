package MultiThreading;

public class SleepMethod extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(1000);
                System.out.println("i : " + i);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) {
        SleepMethod sm = new SleepMethod();
        sm.start();
    }
}
