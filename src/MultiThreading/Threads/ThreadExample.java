package MultiThreading.Threads;

public class ThreadExample   extends  Thread
{
    public  void run()
    {
        for(int i =0; i<10;i++)
        {
            System.out.println("value of I " + i);
        }
    }

    public static void main(String[] args) {
        ThreadExample thread =  new ThreadExample();
        thread.start();
    }
}


