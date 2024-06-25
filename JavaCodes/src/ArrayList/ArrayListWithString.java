package ArrayList;
import java.util.ArrayList;

public class ArrayListWithString {

    static void ArrayStringMethod(ArrayList<String> fruits ){
        // Adding elements to the ArrayList
        fruits.add("Apple");  // Index 0
        fruits.add("Banana"); // Index 1
        fruits.add("Orange"); // Index 2

        // Accessing elements using index
        String firstFruit = fruits.get(0); // "Apple"
        String secondFruit = fruits.get(1); // "Banana"
        String thirdFruit = fruits.get(2); // "Orange"

        // Printing elements
        System.out.println("First fruit: " + firstFruit);
        System.out.println("Second fruit: " + secondFruit);
        System.out.println("Third fruit: " + thirdFruit);
    }

    public static void main(String[] args) {
            // Creating an ArrayList of strings
            ArrayList<String> fruits = new ArrayList<>();
            ArrayListWithString.ArrayStringMethod(fruits);


        }
    }

