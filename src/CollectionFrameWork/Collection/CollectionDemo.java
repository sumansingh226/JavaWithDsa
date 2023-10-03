package CollectionFrameWork.Collection;
import java.util.ArrayList;
public class CollectionDemo {


    public static void main(String[] args) {

        ArrayList arrayList =  new ArrayList();
        arrayList.add("1");
        arrayList.add("23");
        arrayList.addAll(arrayList);
        arrayList.remove("23");
        System.out.println(arrayList);
        arrayList.removeAll(arrayList);
        System.out.println(arrayList);
    }
}
