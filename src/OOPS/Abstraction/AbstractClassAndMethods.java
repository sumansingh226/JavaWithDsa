package OOPS.Abstraction;

public class AbstractClassAndMethods {

     static  abstract  class Animal
     {
         int a;
         abstract void printName();
     }
     static  class  Dog extends  Animal
     {
         public  void  printName(){
             System.out.println("hello child");

         }
     }

    public static void main(String[] args) {
        Dog d  =  new Dog();
        d.printName();

    }
}
