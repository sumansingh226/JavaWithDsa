package OOPS.Polymorphism;

public class DynamicPloyMorphism {

     static class  Apple {


         void printMacBook()
         {
             System.out.println("i have  Mac Book Pro" );
         }
     }

     static  class Iphone extends  Apple
     {
         void printMacBook()
         {
             System.out.println("i have  I phone 12 pro max." );
         }
     }

    public static void main(String[] args) {

      Apple a1 = new Apple();
      a1.printMacBook();
        Iphone i1 = new Iphone();
        i1.printMacBook();
    }
}
