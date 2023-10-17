package CollectionFrameWork.Set;

import java.util.HashSet;

public class HashSetExample {


    public static void main(String[] args) {
        HashSet hs =  new HashSet();
         hs.add("suman");
        hs.add(20.36);
         hs.add("chauhan");
        hs.add(20);
        hs.remove("suman");
        hs.add(true);
        hs.add(null);

        System.out.println(hs);
    }
}
