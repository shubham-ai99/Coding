package ArrayList;

import java.util.ArrayList;

public class ArrayListWork {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
