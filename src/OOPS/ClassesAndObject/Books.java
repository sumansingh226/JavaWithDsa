package OOPS.ClassesAndObject;

public class Books {
    String bookName ;
    double prize;
    private  String author ;

    public  String getAuthor() // getter method for access author name outside of class
    {
        return  author;
    }

    public  void  setAuthor(String name)
    {
        author = name;
        return;
    }
}
