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
        System.out.println("linked-list-1 " +ll);

        // follow the iteration order (it means in which order you oder you inserted element it will iterate in same way)
        Iterator itr = ll.iterator();

        while (itr.hasNext())
        {
            System.out.println("itr " + itr.next());
        }

        // add all the elements of ll  to ll2 using addAll() method
        LinkedList ll2 =  new LinkedList();
        ll2.addAll(ll);

        System.out.println("linked-list-2 " +ll2);

        // remove an element from list
          ll.remove(0);
        System.out.println("list after remove from index 0 " + ll);

        // check size of linked list object
        System.out.println("size : "  + ll.size());

         // contains method to check  if object contain a particular element or not
        System.out.println("contains " + ll.contains(3));

        // contain all method to check all elements contain or not
        System.out.println( "containsAll " +ll2.containsAll(ll));

        // remove all elements from collection object or  list
        ll.removeAll(ll);
        System.out.println("remove all elements from list " + ll);


         // clear method to remove all elements from linked list
        ll2.clear();
        System.out.println("clear , "+ ll2);

        // check if a list  object is empty or not
        System.out.println( "isEmpty : " + ll.isEmpty());

        // add first
          ll.addFirst(1);
          ll.add(2);
          ll.addLast(3);
        System.out.println("ll " + ll);
    }
}
