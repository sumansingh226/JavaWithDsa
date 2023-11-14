package OOPS.KeyWords;

public class FinalKeyWord {


       final  static  class  MyFinalClass
       {
           final   double PI = 3.14;
           final void display() {
               System.out.println("This is a final method PI= " + this.PI);
           }
       }


    public static void main(String[] args) {

         MyFinalClass m1 = new MyFinalClass();
         m1.display();

    }
}
