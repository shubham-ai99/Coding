package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighest {



        public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);

        Optional<Integer> secondHighest = numbers.stream()
                .distinct() // To remove duplicates
                .sorted((a, b) -> b - a) // Sort in descending order
                .skip(1) // Skip the highest number
                .findFirst(); // Get the second highest number

        if (secondHighest.isPresent()) {
            System.out.println("The second highest number is: " + secondHighest.get());
        } else {
            System.out.println("The list doesn't have enough unique numbers.");
        }
    }
}

//
//import java.util.Arrays;
//        import java.util.List;
//        import java.util.Optional;
//
//public class SecondHighestNumber {
//
//}
