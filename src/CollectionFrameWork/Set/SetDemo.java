package CollectionFrameWork.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {


    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("0123");
        s.add("suman01233");
        s.add(null);
        System.out.println("IsEmpty "  +    s.isEmpty());
        System.out.println("Set is : " + s);
        Iterator i = s.iterator();

        while ((i.hasNext()))
        {
            System.out.println("itr "  + i.next());
        }
    }
}
