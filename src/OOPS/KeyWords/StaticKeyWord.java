package OOPS.KeyWords;

public class StaticKeyWord {

   static  String myName = "Suman singh";  // static variable

    static  void  printMyName()
    {
        System.out.println("my name is : " + myName);
    }
    static int x;
    static int y;

    static {
        x = 10;
        System.out.println("First static block is executed.");
    }

    static {
        y = 20;
        System.out.println("Second static block is executed.");
    }

    public static void main(String[] args) {

       String myName =  StaticKeyWord.myName;
        System.out.println(StaticKeyWord.myName);
        StaticKeyWord.printMyName();
    }
}
