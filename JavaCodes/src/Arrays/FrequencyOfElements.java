package Arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 1, 2, 3};

        // Array to store the frequency of each element
        int[] frequency = new int[array.length];
        // Array to mark visited elements
        boolean[] visited = new boolean[array.length];

        // Initialize frequencies to 0 and visited to false
        for (int i = 0; i < array.length; i++) {
            frequency[i] = 0;
            visited[i] = false;
        }

        // Calculate frequency of each element
        for (int i = 0; i < array.length; i++) {
            // If element is already visited, continue to the next iteration
            if (visited[i])
                continue;

            // Count frequency of current element
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true; // Mark the element as visited
                }
            }
            frequency[i] = count;
        }

        // Print the frequency of each element
        System.out.println("Frequency of elements in the array:");
        for (int i = 0; i < array.length; i++) {
            if (!visited[i]) { // Print only if the element is not visited already
                System.out.println(array[i] + " occurs " + frequency[i] + " times");
            }
        }
    }
}