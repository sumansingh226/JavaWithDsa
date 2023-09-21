package OOPS.InheritanceInJava;

public class HierarchicalInheritance {

   static class Vehicle
   {
       public void  countTyres(String vehicle , int numberOfTyres) {

           System.out.println(vehicle +" " +   "have" + " " + numberOfTyres +" " +   "Tyres.");
       }
   }

   static class Bike extends Vehicle {
   }

  static  class  Car extends Vehicle {
   }
    public static void main(String[] args) {
       Bike b1 = new Bike();
        b1.countTyres("Suzuki Hayabusa Bike" ,2);
        Car c1 = new Car();
        c1.countTyres("Maruti Suzuki Car" ,4);

    }
}
