package OOPS.Encapsulation;

public class EncapsulationInJava {

      static  class Employee{
          private  int eId;
          private String name = "suman singh";
          public  String getEmployeeName(){

              return name;
          }
          public  void  setEmployeeId(int id)
          {
              eId=id;
          }
      }

    public static void main(String[] args) {

            Employee e1 =  new Employee();
        String eName = e1.getEmployeeName();
        System.out.println("Employee Name " + eName);
        e1.setEmployeeId(101);
        System.out.println("Employee Name " + e1.eId);
    }
}
