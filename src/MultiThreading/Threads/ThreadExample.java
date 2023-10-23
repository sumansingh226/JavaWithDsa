package MultiThreading.Threads;

public class ThreadExample   extends  Thread
{
    public  void run()  // it is used to perform the task or task that will be performed by Thread
    {
        for(int i =0; i<10;i++)
        {
            if(i==7)
            {
                try {
                    sleep(10000);  // thread will sleep for 10sec
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("value of I " + i);
        }
    }

    public static void main(String[] args) {
        ThreadExample thread =  new ThreadExample();
        thread.start(); // start method is used to start the tread

    }
}


