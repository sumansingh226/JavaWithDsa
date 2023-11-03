package MultiThreading.Synchronization;

class  TotalEarnings extends  Thread
{
    int total =0;
    public void run()
    {
        for (int i =0; i<=10;i++)
        {
            total = total+10;
        }
    }
}

public  class InterThreadCommunicationExample  {

    public static void main(String[] args) {
        TotalEarnings te = new TotalEarnings();
        te.start();
        System.out.println("Total Earnings : " + te.total + " INR.");
    }
}