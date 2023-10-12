package CollectionFrameWork.LegecyClasses;

import java.util.Vector;

public class VectorsDemo {
    public static void main(String[] args) {
        // Create a Vector of type Object
        Vector vector = new Vector();

        // Add elements to the Vector using addElement(Object obj)
        vector.addElement("First Element");
        vector.addElement("Second Element");
        vector.addElement("Third Element");

        // Access the first and last elements
        Object firstElement = vector.firstElement();
        Object lastElement = vector.lastElement();

        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Remove an element from the Vector using removeElement(Object obj)
        vector.removeElement("Second Element");

        // Remove all elements from the Vector using removeAllElements()
        vector.removeAllElements();

        // Add new elements
        vector.addElement("New First Element");
        vector.addElement("New Second Element");
        vector.addElement("New Third Element");

        // Remove an element at a specific index using removeElementAt(int index)
        vector.removeElementAt(1);

        // Check the current capacity of the Vector
        int capacity = vector.capacity();

        // Print the elements and capacity
        System.out.println("Vector Elements: " + vector);
        System.out.println("Current Capacity: " + capacity);
    }
}
