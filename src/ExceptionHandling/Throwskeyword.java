package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Throwskeyword {


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

    public static void main(String[] args) {

         Throwskeyword th = new Throwskeyword() ;
    }
}
