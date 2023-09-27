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


    public static void main(String[] args) throws UnderAgeVotingException {

        System.out.print("Enter Age :  ");
        Scanner sc =  new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18)
        {
            throw  new UnderAgeVotingException("You are Under age ");
        }
        else
        {
            System.out.println("You are eligible . ");
        }


    }
}
