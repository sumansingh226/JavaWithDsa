package ExceptionHandling;
import java.util.Scanner;
public class ThrowKeyword {

    static class YoungerAgeException extends RuntimeException {
        YoungerAgeException(String msg) {
            super(msg);
        }
    }

    public void divideByZero() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Age : ");
            int age = sc.nextInt();
            if (age < 18) {
                throw new YoungerAgeException("You are not eligible for voting");
            } else {
                System.out.println("You are eligible for voting");
            }
        } catch (YoungerAgeException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThrowKeyword throwKeyword = new ThrowKeyword();
        throwKeyword.divideByZero();
    }


}
