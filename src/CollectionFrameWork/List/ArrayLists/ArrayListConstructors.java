package CollectionFrameWork.List.ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConstructors {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(12);
        al.add(123);
        al.add(1234);
        System.out.println("al : " +  al);
        ArrayList al2 = new ArrayList(al);
        System.out.println("al2 : " +  al2);
        System.out.println(al2.get(2));
        System.out.println(  al.indexOf(123));
//       al.removeAll(al);
        Iterator i = al.iterator();
        while (i.hasNext())
        {
            System.out.println("i"  + i.next());
        }
    }
}
