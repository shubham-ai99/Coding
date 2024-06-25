package Arrays;

public class ArrayDeletionExample {
    public void Deletion() {
        int[] array = {1, 2, 3, 4, 5};
        int position = 2; // Index of the element to delete

        // Shift elements to the left to close the gap left by the deleted element
        for (int i = position; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        // Set the last element to 0 or any default value to signify deletion
        array[array.length - 1] = 0;

        // Print the updated array
        System.out.println("Array after deletion:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}