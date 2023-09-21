package OOPS.ClassesAndObject;

import OOPS.Books;

public class GettersAndSettersInJava {


    public static void main(String[] args) {

        Books b1 = new Books();

//        for  set author name
    b1.setAuthor("Suman singh");
    //  for geta author name
       String authorName = b1.getAuthor();
        System.out.println(authorName);
    }
}
