package Arrays;

public class TwoArraysCommonElements {

    public static void main(String[] args) {
        int[] Arr1= {1,5,7,9,3};
        int[] Arr2= {1,4,7,8,3};

        for(int i=0; i< Arr1.length; i++ ){

            for(int j=0; j< Arr2.length; j++){

                if(Arr1[i] == Arr2[j]){
                    System.out.println(Arr1[i]);
                }
            }
        }
    }
}
