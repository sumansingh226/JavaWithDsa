package OOPS.KeyWords;

public class ThisKeyWord {


       static  class Computer{
           private  String name ="MAC BOOk";


            public Computer()
            {
                this("MAC BOOk1"); // To Invoke Current Class Constructors:

            }
           public Computer(String name)
           {
               this.name = name; // using this to refer current class instance variable
           }
           void updateName(String name)
           {
               this.name = name; // using this to refer current class instance variable
           }

           Computer method1(Computer c)
            // this keyword can be used to return current class instance from method
            {
                System.out.println(c);
                return  this;
            }

            void  method2()
            {
                this.method1(this);  // this keyword can be used for passing an argument inside a method
            }

       }



    public static void main(String[] args) {

     Computer c1 = new Computer();
        System.out.println(c1.name);
     c1.updateName("Mac Book Pro");
        System.out.println(c1.name);
        c1.method2();
    }
}
