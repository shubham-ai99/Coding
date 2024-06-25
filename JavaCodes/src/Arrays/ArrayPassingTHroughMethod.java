package Arrays;

public class ArrayPassingTHroughMethod {


    static void fun(int arr[]){
        for (int i: arr) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        fun(new int[]{10,20,30});
    }
}
