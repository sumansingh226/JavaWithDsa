package MultiThreading;

public class ThreadPrioritiesExample extends Thread {

    public void run() {
        System.out.println("Current thread priority : " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadPrioritiesExample tpe = new ThreadPrioritiesExample();
        tpe.setPriority(1);
        tpe.start();

        System.out.println("Current thread priority : " + Thread.currentThread().getPriority());

    }


}
