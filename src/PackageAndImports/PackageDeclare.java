package PackageAndImports;

// Import specific classes
 import java.util.ArrayList;
 import java.util.List;
 // Import all classes from a package
  import java.util.*;

public class PackageDeclare {
    public static void main(String[] args) {
        // Use classes from the imported packages
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
