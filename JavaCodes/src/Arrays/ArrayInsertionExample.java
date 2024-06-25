package Arrays;/*
    Array Insertion at some specific position

 */


public class ArrayInsertionExample extends ArrayDeletionExample{
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int elementToInsert = 10;
        int position = 2; // Index where element should be inserted

        System.out.println("Array after insertion:");
        // Shift elements to the right to make space for the new element
        for (int i = array.length - 1; i > position; i--) {
            array[i] = array[i - 1];
        }

        // Insert the new element at the specified position
        array[position] = elementToInsert;

        // Print the updated array
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();

        ArrayDeletionExample deletion2= new ArrayDeletionExample();
        deletion2.Deletion();
    }
}