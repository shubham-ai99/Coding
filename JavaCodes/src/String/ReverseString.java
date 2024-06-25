package String;

public class ReverseString {

    static  String reverseFunction(String str){
        char ch[] = str.toCharArray();
        int left =0;
        int right = str.length() - 1;

        while(left<right){ // left=4 , right=4
            char temp = ch[right]; // temp = p
            ch[right] = ch[left]; // t --> p
            ch[left] = temp; //p --> t
            left++;
            right--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Shubh");
        System.out.println("reverse 2 : " + sb.reverse());


        String str = "Parikshit";
        System.out.println("String is : " + str);
        System.out.println("Reverse String is : " + reverseFunction(str));

    }
}
