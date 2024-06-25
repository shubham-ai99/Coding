package ArrayList.AllOps;

import java.util.Arrays;

public class SimpleArrayExample2 {
    public static void main(String[] args) {
        // Create and initialize an array
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Access elements in the array
        System.out.println("First fruit: " + fruits[0]);  // Output: Apple
        System.out.println("Second fruit: " + fruits[1]); // Output: Banana

        // Modify an element in the array
        fruits[2] = "Blueberry";

        // Iterate through the array
        System.out.println("All fruits in the array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Find the length of the array
        System.out.println("Number of fruits: " + fruits.length);

        // Print the updated array
        System.out.println("Updated list of fruits:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit " + (i + 1) + ": " + fruits[i]);
        }

        // Search for an element in the array
        String searchElement = "Banana";
        boolean found = false;
        for (String fruit : fruits) {
            if (fruit.equals(searchElement)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(searchElement + " is in the array.");
        } else {
            System.out.println(searchElement + " is not in the array.");
        }

        // Sort the array
        Arrays.sort(fruits);
        System.out.println("Sorted list of fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Copy the array
        String[] fruitsCopy = Arrays.copyOf(fruits, fruits.length);
        System.out.println("Copy of the array:");
        for (String fruit : fruitsCopy) {
            System.out.println(fruit);
        }

        // Convert the array to a string
        String fruitsString = Arrays.toString(fruits);
        System.out.println("Array as a string: " + fruitsString);
    }
}

