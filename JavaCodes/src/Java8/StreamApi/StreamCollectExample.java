package Java8.StreamApi;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
public class StreamCollectExample {

        public static void main(String[] args) {
            String[] colors = {"red", "blue", "green", "blue", "yellow"};

            // Collecting stream elements into a Set
            Set<String> collectedSet = Arrays.stream(colors)
                    .collect(Collectors.toSet());

            System.out.println("Unique Colors: " + collectedSet);
        }
    }


