package OOPS.KeyWords;

public class SuperKeyWord {

      static  class Animal{

          String name = "Tiger";
          Animal()
          {
              name = "Parent Tiger ";
          }
      }

      static  class Dog extends  Animal
      {
          String name = "Dog";
          Dog()
          {
              super();
              System.out.println("child Dog");
          }
          void  printAnimalName()
          {
              System.out.println(this.name);
              System.out.println(super.name);

          }

      }

    public static void main(String[] args) {

          Dog d1 = new Dog();
          d1.printAnimalName();

    }

}
