package ExceptionHandling;

import java.util.Scanner;

public class ThrowKeyword {


     public static  void deviceByZero()
     {

         try{
             Scanner sc  = new Scanner((System.in));
             System.out.println( "Enter Age : ");
             int age  =sc.nextInt() ;
             if(age<18)
             {
                 throw  new Exception("you are not eligible for voting");

               }
             else
             {
                 System.out.println("You are eligible for voting");
             }

         }
         catch (Exception ex)
         {
               ex.printStackTrace();
         }
     }
    public static void main(String[] args) {
        ThrowKeyword.deviceByZero();
    }
}
