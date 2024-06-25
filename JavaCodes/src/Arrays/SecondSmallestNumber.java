package Arrays;

import java.util.Arrays;

/*
   finding Second Smallest Number from given array by using streams
 */

public class SecondSmallestNumber {

    public void FindSecondSmallestElement(int[] nums){

        System.out.println(" 2nd highest Array elements ");
        int secondSmallestNumber= Arrays.stream(nums).distinct().
                sorted().skip(1). findFirst().
                orElseThrow(() -> new IllegalArgumentException("Array doesn't have 2nd smallest number")) ;
        System.out.println(secondSmallestNumber);
    }

    public static void main(String[] args) {

        SecondSmallestNumber smallest = new SecondSmallestNumber();
        System.out.println(" Array elements ");
        int[] nums= {1,1,1,4,9,3,13,2};//declaration, instantiation and initialization
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

       smallest.FindSecondSmallestElement(nums);


    }

}
