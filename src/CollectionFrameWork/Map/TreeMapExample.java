package CollectionFrameWork.Map;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap with Integer keys and String values
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Insert key-value pairs
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");

        // Access elements
        String value = treeMap.get(2); // Retrieves "Two"

        // Iterate through the TreeMap
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing an element
        treeMap.remove(1);

        // Check if a key exists
        boolean containsKey = treeMap.containsKey(1); // Should return false

        // Navigating through the map
        Map.Entry<Integer, String> lowerEntry = treeMap.lowerEntry(3); // Gets the entry with key < 3

        // Getting a submap
        SortedMap<Integer, String> subMap = treeMap.subMap(2, 4); // Keys between 2 (inclusive) and 4 (exclusive)

        // Clear the TreeMap
        treeMap.clear();
    }
}
