package CollectionFrameWork.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {


    public static void main(String[] args) {


        List al = new ArrayList<Integer>(); // create a reference of List from using object ArrayList
        al.add("1");
        al.add(0 ,5);
        al.add(5 );
        al.add(null);
        al.add(null);
        System.out.println(al);
        Iterator i = al.iterator();

        while ((i.hasNext()))
        {
            System.out.println("itr "  + i.next());
        }
    }
}
