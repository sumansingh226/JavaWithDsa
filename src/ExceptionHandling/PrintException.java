package ExceptionHandling;

public class PrintException {


    public static void main(String[] args) {

        try {
            int a  =10;
            int b =0;
            System.out.println( a/b);

        } catch (ArithmeticException ex) {

            ex.setStackTrace( ex.getStackTrace());  // print exception , description stack trace
            System.out.println("exception " + ex.toString());
            System.out.println("ex.getMessage() " + ex.getMessage());
        }
    }
}
