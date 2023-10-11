package CollectionFrameWork.List.ArrayLists;

import java.util.ArrayList;

public class ArrayListConstructors {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(12);
        al.add(123);
        al.add(1234);
        System.out.println("al + " +  al);
        ArrayList al2 = new ArrayList(al);
        System.out.println("al2 + " +  al2);
    }
}
