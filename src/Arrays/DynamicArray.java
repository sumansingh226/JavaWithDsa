package Arrays;
import java.util.Arrays;

public class DynamicArray {

    public static class ArrayList {
        int[] arr = new int[2];
        int idx =0;
        int size =0;
        public void add(int element)
        {
            if(size == arr.length)
            {
                int[] newArray = Arrays.copyOf(arr, arr.length*2);
                arr =newArray;
            }
            arr[idx] = element;
            idx++;
            size++;
        }
    }


    public static void main(String[] args) {

         ArrayList arr =  new ArrayList();
         arr.add(5);
         arr.add(6);
         arr.add(2);
  }
}
