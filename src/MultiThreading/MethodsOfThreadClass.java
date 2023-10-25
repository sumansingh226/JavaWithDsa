package MultiThreading;

public class MethodsOfThreadClass extends Thread {





    public static void main(String[] args) {

        System.out.println("CurrentThread " + Thread.currentThread() ); // to get currentThread
        System.out.println("CurrentThreadName " + Thread.currentThread().getName() ); // to get currentThreadName
         Thread.currentThread().setName("mainThread1") ; // set current Thread name
        System.out.println("CurrentThreadName " + Thread.currentThread().getName() ); // to get currentThreadName

    }
}
