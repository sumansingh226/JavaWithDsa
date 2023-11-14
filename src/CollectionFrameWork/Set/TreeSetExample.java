package CollectionFrameWork.Set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(2); // Duplicate element, will not be added

        // Display the TreeSet (in sorted order)
        System.out.println("TreeSet: " + treeSet);

        // Check if an element exists
        System.out.println("Contains 8: " + treeSet.contains(8));

        // Remove an element
        treeSet.remove(2);
        System.out.println("After removing 2: " + treeSet);

        // Iterate through the TreeSet (in sorted order)
        System.out.println("Iterating through the TreeSet:");
        for (Integer item : treeSet) {
            System.out.println(item);
        }
    }
}
