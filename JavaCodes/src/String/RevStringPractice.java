package String;

public class RevStringPractice {

    public static void main(String[] args) {


        String str = "abcde xyz ";

        str.split(" ");

        char[] ch = str.toCharArray();

        int length= str.length();


        for(int i=length-1; i>=0; i--){
            System.out.print(str.charAt(i));;
//            System.out.print(ch[i]);
        }
    }
}
