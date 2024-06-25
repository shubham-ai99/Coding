package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSortByFirstLetter {
        public static void main(String[] args) {
            // Creating an ArrayList of strings
            ArrayList<String> fruits = new ArrayList<>();

            // Adding elements to the ArrayList
            fruits.add("Orange");
            fruits.add("Apple");
            fruits.add("Banana");

            // Sorting the ArrayList by the first letter of each string
            Collections.sort(fruits, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    // Compare the first characters of the strings
                    return Character.compare(s1.charAt(0), s2.charAt(0));
                }
            });

            // Printing the sorted elements
            System.out.println("Sorted fruits by first letter:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        }
    }

