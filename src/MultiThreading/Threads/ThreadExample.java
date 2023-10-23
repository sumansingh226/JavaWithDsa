package MultiThreading.Threads;

public class ThreadExample   extends  Thread
{
    public  void run()  // it is used to perform the task or task that will be performed by Thread
    {
        for(int i =0; i<10;i++)
        {
            System.out.println("value of I " + i);
        }
    }

    public static void main(String[] args) {
        ThreadExample thread =  new ThreadExample();
        thread.start(); // start method is used to start the tread
    }
}


