package OOPS.Polymorphism;

public class StaticPolyMorphism {


   static class Calculator
   {
        int add(int a ,  int b)
       {
           return a+b;
       }
       double add(double a ,  int b)
       {
           return a+b;
       }
       double add(double a ,  double b)
       {
           return a+b;
       }
   }

    public static void main(String[] args) {
       Calculator c1 = new Calculator();
        System.out.println( c1.add(10,20));
        System.out.println( c1.add(10.2,20));
        System.out.println( c1.add(10.6,20.9));
    }
}
