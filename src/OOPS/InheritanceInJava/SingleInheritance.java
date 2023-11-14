package OOPS.InheritanceInJava;


public class SingleInheritance {
    static  class Dog extends Animal {
        // You can add additional properties and methods specific to Dog here
    }
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Buddy";  // Setting the name for the Dog instance
        d1.age = 3;         // Setting the age for the Dog instance
        // You can also call methods from the Animal class
        d1.setColor("Brown");  // Calling the static method from Animal class
        System.out.println(d1.color);
    }
}
