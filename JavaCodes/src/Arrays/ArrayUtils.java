package Arrays;

import java.util.Arrays;
public class ArrayUtils {

    public static void main(String[] args) {
        int[] arr = {2, 4,3, 3, 1, 7,7, 3};
                  //{1, 2,3, 3, 3, 4, 7}

        Arrays.sort(arr);
//        System.out.println("before: "+ arr);
        System.out.println();
        int secondHighest = arr.length-2;
        int arr2= arr[secondHighest];
        System.out.println("secondHighest : " + arr2);

        for (int i = 0; i < arr.length + 1; i++) {
            System.out.print(" " + arr[i]);
        }


    }
}

/*
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at Arrays.ArrayUtils.main
 */