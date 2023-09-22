package ExceptionHandling;

import java.io.FileInputStream;

public class TryCatchBlock {


    public static void main(String[] args) {

        try{
            FileInputStream fe = new FileInputStream("d:/abc.txt");
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}
