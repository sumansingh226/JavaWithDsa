package ExceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {


    public static void main(String[] args) {

        try{
            FileInputStream fe = new FileInputStream("d:/abc.txt");
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex);
        }
    }
}
