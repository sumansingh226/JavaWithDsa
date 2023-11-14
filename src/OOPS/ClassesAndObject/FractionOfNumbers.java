package OOPS.ClassesAndObject;

public class FractionOfNumbers {

  public  static  class  Fraction {
      int neu;
      int den;
    public   Fraction (int neu , int den)
      {
          this.neu = neu;
          this.den  = den;

      }
      public  static  String printFraction(int neu , int den)
      {
           return  neu + "/" + den;
      }
  }
    public static void main(String[] args) {


       Fraction fc  =  new Fraction(3,7);
        System.out.println(Fraction.printFraction(4,5));
        System.out.println(fc.printFraction(3, 7));
    }
}
