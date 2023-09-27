package ExceptionHandling;
import java.util.Scanner;

  class  UnderAgeVotingException extends Exception
 {
     UnderAgeVotingException()
     {
         super("you are under age");
     }
     UnderAgeVotingException(String userExceptionMsg)
     {
         super(userExceptionMsg);
     }
 }

  public class CustomExceptionHandling {

    public static void main(String[] args)   {

        System.out.print("Enter Age :  ");
        Scanner sc =  new Scanner(System.in);
        int age = sc.nextInt();

       try{
           if(age<18)
           {
               throw  new UnderAgeVotingException();
           }
           else
           {
               System.out.println("You are eligible . ");
           }
       }
       catch (UnderAgeVotingException e)
       {
           System.out.println(e.getMessage().toString());
       }

    }
}
