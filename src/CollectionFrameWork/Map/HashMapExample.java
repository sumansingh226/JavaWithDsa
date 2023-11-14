package CollectionFrameWork.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {


    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(0 ,"10");
        hm.put(1,"suman singh");
        hm.put(2,2);
        hm.put(3,2.2);
        hm.put(4,false);
        hm.put(5,null);
        System.out.println("HashMap = " + hm);

        Set set = hm.entrySet();
        System.out.println("set = " + set);
        Iterator itr = set.iterator();
        while (itr.hasNext())
        {

            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println("entry keys " + entry.getKey());
            System.out.println("entry values " + entry.getValue());
        }
        hm.remove( 3);
        System.out.println(hm);

        System.out.println("contains " + hm.containsValue("suman singh"));
        hm.replace(1, "suman  chauhan");
        System.out.println(hm);

    }
}
