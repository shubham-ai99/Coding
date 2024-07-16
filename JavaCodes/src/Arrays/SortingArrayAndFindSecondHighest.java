package Arrays;

public class SortingArrayAndFindSecondHighest {
    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 4, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0; i<arr.length; i++) {
            System.out.println("after array sort arr : " + arr[i]);
        }
        System.out.println("Second highest element is " + arr[1]);


    }
}
