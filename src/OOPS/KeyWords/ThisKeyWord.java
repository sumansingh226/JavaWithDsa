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
       }



    public static void main(String[] args) {

     Computer c1 = new Computer();
        System.out.println(c1.name);
     c1.updateName("Mac Book Pro");
        System.out.println(c1.name);
    }
}
