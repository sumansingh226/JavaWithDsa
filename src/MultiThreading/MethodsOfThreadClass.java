package MultiThreading;

public class MethodsOfThreadClass extends Thread {

    public void run() {
        System.out.println("instance Thread running");
    }


    public static void main(String[] args) {

        System.out.println("CurrentThread : " + Thread.currentThread()); // to get currentThread
        System.out.println("CurrentThreadName : " + Thread.currentThread().getName()); // to get currentThreadName
        Thread.currentThread().setName("suman singh's Thread"); // set current Thread name
        System.out.println("CurrentThreadName : " + Thread.currentThread().getName()); // to get currentThreadName

        MethodsOfThreadClass mte = new MethodsOfThreadClass();
        mte.setName("InstanceThread");
        System.out.println("mte name :  " + mte.getName());
        mte.start();
        System.out.println("is thread " + Thread.currentThread().getName() + "  is alive " + Thread.currentThread().isAlive());  // check is current Thread aive
        System.out.println("mte  is thread " + mte.currentThread().getName() + "  is alive " + Thread.currentThread().isAlive());
    }
}
