package Arrays;
import java.util.Arrays;
public class ThirdHighest {
    public static void main(String[] args) {


                int[] arr = {5, 3, 1, 4, 2, 6, 9, 8};

                // Sort the array in descending order
                Arrays.sort(arr);

                // Print the array to see its sorted order
                System.out.println("Sorted array: " + Arrays.toString(arr));

                // The third highest element will be at length - 3 position
                if (arr.length < 3) {
                    System.out.println("Array doesn't have at least 3 elements.");
                } else {
                    System.out.println("Third highest element is " + arr[arr.length - 3]);
                }
        }
    }
