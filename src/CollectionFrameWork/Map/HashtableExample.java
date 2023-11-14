package CollectionFrameWork.Map;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding key-value pairs
        hashtable.put("Alice", 25);
        hashtable.put("Bob", 30);
        hashtable.put("Charlie", 22);

        // Retrieving values by key
        int age = hashtable.get("Bob");
        System.out.println("Bob's age is " + age);

        // Iterating over keys
        for (String name : hashtable.keySet()) {
            System.out.println("Name: " + name + ", Age: " + hashtable.get(name));
        }
    }
}
