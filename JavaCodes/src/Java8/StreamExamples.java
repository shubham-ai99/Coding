package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples{
    public void StreamOperation(){
        // Create a list with duplicate values
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice", "Eve", "Bob");
        List<String> uniqueNames = names.stream()
                .distinct()
                .collect(Collectors.toList());
        // Print the unique names
        System.out.println("Unique names: " + uniqueNames);
    }

    public void forEachMethod() {
        List<Integer> values = Arrays.asList(2,4,6,2,8,4,10);
        //values.forEach(i -> System.out.println(i));
        List<Integer> uniqueNames = values.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNames);
    }
}





