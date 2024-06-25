package Arrays;

public class TestArr {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void main(String args[]) {
        printArray(new int[]{10, 22, 44, 66});//passing anonymous array to method


        //cloning of Array

        System.out.println("Printing clone of the array:");
        int[] arr = {2, 4, 1, 7, 3};
        int carr[] = arr.clone();  // CLONING

        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("cloned array");

        for (int i : carr) {
            System.out.println(i);
        }

    }
}