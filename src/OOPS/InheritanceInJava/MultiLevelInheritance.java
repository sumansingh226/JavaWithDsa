package OOPS.InheritanceInJava;

public class MultiLevelInheritance {

    static class Men {

        public  void countEars() {
            System.out.println("Men have 2 ears");
        }
    }

    static class Suman extends Men {
        public  void countEars() {
            System.out.println("Suman have 2 ears");
        }
    }

    static  class  Akash extends  Suman {
        public  void countEars() {
            System.out.println("Akash have 2 ears");
        }
    }

    public static void main(String[] args) {
        Akash s1 = new Akash();
        s1.countEars(); // Call the static method from the child class
    }
}
