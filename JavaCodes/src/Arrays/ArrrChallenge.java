package Arrays;

import java.util.Arrays;

public class ArrrChallenge {

    public static void main(String[] args) {

        //int c[];
        int[] arr1 = {1, 2, 3};

        int[] arr2 = new int[2 * arr1.length];

        for(int i=0; i< arr1.length; i++){

            arr2[i]= arr1[i];
            }
        for(int i=0;i<arr1.length; i++){
            arr2[i + arr1.length] =arr1[i];
        }
        System.out.println(Arrays.toString(arr2));

    }
}
