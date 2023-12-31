package CollectionFrameWork.Collection;
import java.util.ArrayList;
public class CollectionDemo {


    public static void main(String[] args) {

        ArrayList arrayList =  new ArrayList();
        arrayList.add("1");
        arrayList.add("23"); //add one value to array
        arrayList.addAll(arrayList); // add one object to other object or add all the values of one object to other object
        System.out.println( arrayList.size()); // size of collection object
        arrayList.remove("1"); // remove one value from arrayList
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty()); // is collection object empty
        System.out.println(arrayList.contains("23")); // is it contain a value
        arrayList.removeAll(arrayList); // remove one object to other object or add all the values of one object to other object
        System.out.println(arrayList);
        System.out.println(arrayList.contains("23"));
        System.out.println(arrayList.isEmpty()); // is collection object empty
    }
}
