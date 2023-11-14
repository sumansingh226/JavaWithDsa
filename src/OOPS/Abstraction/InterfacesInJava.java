package OOPS.Abstraction;

public class InterfacesInJava {

    interface Men {

        public  static  final String name  = "Suman";
        public  static  final String age  = "20";
        public abstract void printName();
        public abstract  void printAge();
        public  static  void Display(){

        }
        default  void myDefault()
        {

        }
    }

    static class Suman implements Men {

        public void printName() {
            System.out.println("Suman");
        }

        public void printAge() {
            System.out.println("20");
        }
    }

    public static void main(String[] args) {
        Suman suman = new Suman();
        suman.printName(); // Call the implemented method
        suman.printAge();  // Call the implemented method
    }
}
