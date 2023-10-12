package CollectionFrameWork.List.LinkedList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {


    public static void main(String[] args) {
        LinkedList ll =  new LinkedList();
        ll.add("first-Node");  // add an element to linked-list
        ll.add("second-Node");  // add an element to linked-list
        ll.add(3);  // add an element to linked-list
        ll.add('S');  // add an element to linked-list
        ll.add(3);  // add an element to linked-list   (it can store duplicate values)
        ll.add(null);  // add a null element to linked-list
        ll.add(null);  // add a duplicate null element to linked-list
        System.out.println(ll);

        // follow the iteration order (it means in which order you oder you inserted element it will iterate in same way)
        Iterator itr = ll.iterator();

        while (itr.hasNext())
        {
            System.out.println("itr " + itr.next());
        }
    }
}
