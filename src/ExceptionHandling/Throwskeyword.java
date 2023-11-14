package ExceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class  ReadAndWriteFile {
    void readFile () throws FileNotFoundException
    {
        FileInputStream fs =  new FileInputStream("d:/abc.text");
    }
    void saveFile () throws  FileNotFoundException
    {
        FileOutputStream fs = new FileOutputStream("d:/abc.text");
    }

}

public class Throwskeyword extends  ReadAndWriteFile {

    static class FileHandlingException extends RuntimeException {
        FileHandlingException(String msg) {
            super(msg);
        }
    }
    public static void main(String[] args) {
         Throwskeyword th = new Throwskeyword();

         try{
             th.readFile();
         }
         catch (FileNotFoundException fx)
         {
             throw new FileHandlingException("File not found .");
         }

    }
}
