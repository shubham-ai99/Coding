package Arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayExamples {

    //find 2 numbers from array who's some is equal to 11
    static void sumOfArrayElementMatchWithX(int[] arr,int x) {
        for(int i=0;i< arr.length; i++ ){
            for(int j= arr.length -1; j>0;j--){
                if(arr[i] + arr[j] == 11){
                    System.out.println("sum of : " + arr[i] + " + " + arr[j] + " is equal to : "+ x );
                }
            }
        }
    }

    static void reverseArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Reversed Array ");
        for(int j=arr.length-1 ; j>=0 ; j--){
            System.out.println(arr[j]);
        }
    }
    static void arraySort(int[] arr){
        System.out.println("sort Array 2 ");

        for (int i=0; i<arr.length; i++){
            for (int j=1; j<arr.length;j++){
                if(arr[i]<arr[j]){
                    arr[i]=arr[j];
                    arr[j]=arr[i];
                    System.out.println(arr[i]);
                }
            }

        }
    }


    public static void main(String[] args) {
        int[] arr = {2,4,6,1,3,7};
        int x=11;
        sumOfArrayElementMatchWithX(arr, x);
//        reverseArray(arr);
//        arraySort(arr);
    }

}
