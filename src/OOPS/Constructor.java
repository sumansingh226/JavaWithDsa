package OOPS;

public class Constructor {

      public  static  class  Student
      {
          String name ;
          int age;
          double percentage;
        static int numberOfStudents;
          final String  schoolName = "GICG"; // for making anything constant
            public  Student()  //default constructor
            {
            }
          public Student(String name, int age, double percentage) {
               this.age = age ;
               this.name = name;
               this.percentage = percentage;
              numberOfStudents++;
          }
          public   Student(int age, String name,  double percentage) {
              this.age = age ;
              this.name = name;
              this.percentage = percentage;
              numberOfStudents++;
          }
      }


    public static void main(String[] args) {
        Student sc3= new Student();
        Student sc = new Student("suman", 18, 70.6);
        System.out.println(sc.age + " "+ sc.name + " "+ sc.percentage);
        Student sc1 = new Student(18, "suman", 70.6);
        Student sc6 = new Student(18,"suman",  70.6);
        Student sc7 = new Student(18,"suman",  70.6);
        System.out.println(sc.schoolName);
        System.out.println(sc6.numberOfStudents);
    }
}
