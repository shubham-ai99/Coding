package ArrayList.AllOps;

public class SimpleArrayExample {
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
    }
}

