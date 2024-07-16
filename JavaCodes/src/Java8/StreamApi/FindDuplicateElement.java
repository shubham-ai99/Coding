package Java8.StreamApi;
import java.util.*;
import java.util.stream.*;

public class FindDuplicateElement {

    // Java program to find the duplicate
// elements in a Stream using Set

        // Function to find the
        // duplicates in a Stream
        public static <T> Set<T>
        findDuplicateInStream(Stream<T> stream)
        {

            // Set for storing the duplicate elements
            Set<T> items = new HashSet<>();

            // Returning the set of duplicate elements
            return stream

                    // Set.add() returns false
                    // if the element was
                    // already present in the set.
                    // Hence filter such elements
                    .filter(n -> !items.add(n))

                    // Collect duplicate elements
                    // in the set
                    .collect(Collectors.toSet());
        }

        // Driver code
        public static void main(String args[])
        {

            // Initial stream
            Stream<Integer> stream
                    = Stream.of(2, 17, 5,
                    20, 17, 30,
                    4, 23, 59, 23);

            // Print the found duplicate elements
            System.out.println(
                    findDuplicateInStream(stream));
        }


}
