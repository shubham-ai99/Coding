package ArrayList;

import java.util.ArrayList;


public class ArraListBasic {
    public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Adding an element at a specific index
        names.add(1, "David");

        // Removing an element
        names.remove("Bob");

        // Iterating over the ArrayList using a for-each loop
        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }

        // Checking if an element exists in the ArrayList
        if (names.contains("Alice")) {
                System.out.println("Alice is present in the list.");
        } else {
            System.out.println("Alice is not present in the list.");
        }

        // Getting the size of the ArrayList
        int size = names.size();
        System.out.println("Size of ArrayList: " + size);

        // Clearing all elements from the ArrayList
        names.clear();

        // Checking if the ArrayList is empty
        if (names.isEmpty()) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList is not empty.");
        }
    }
}

