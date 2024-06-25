package String;

public class StringOperations {

    public static void main(String[] args) {
        String s1 ="Hi";
        String s2 ="Hi";
        String s3 = new String("Hi");

        System.out.println(s1==s2);

        if(s1==s2){
            System.out.println("True");
        }
        else System.out.println("False");

        System.out.println(s1.equals(s2));


        System.out.println("*******************************************************");


        if(s1==s3){
            System.out.println("True");
        }
        else System.out.println("False");

        System.out.println(s1.equals(s3));

        System.out.println("************************** OPERATIONS ************************************");

        String s4 = new String("Hello Everyone");
        //finding string length
        int length = s4.length();
        System.out.println("String length is : " + length);


        //Converting string in lowercase
        String lowerCase = s4.toLowerCase();
        System.out.println("lower case string : " +lowerCase);

        //converting string to upper case
        String upperCase = s4.toUpperCase();
        System.out.println("Upper case string : " + upperCase);

        //finding character at which index
        char ch = s4.charAt(2);
        System.out.println("Finding character at index 2 : " + ch);

        //finding index at which character
        int findIndexOf = s4.indexOf("l");
        System.out.println("Index of character l : " + findIndexOf);


        System.out.println(s3==s4);
        boolean ans = s4.equals(s3);

        System.out.println(ans);

        System.out.println("***********************************");
        String str5 = "abc";
        String str6 = "ab";

        System.out.println(str5.compareTo(str6));

        String concat =str5.concat(str6);
        System.out.println(concat);
        System.out.println(str5 + str6);

        System.out.println("******************************");

        String str7 = " hello world how are you";
        String[] split = str7.split(" ");

        for (String i: split) {
            System.out.println(i);
        }

        System.out.println("******************************");
        String str8 = "Shubham,mangesh,parik,surya,uday";
        String[] splitWithComma = str8.split(",");

        for (String i: splitWithComma) {
            System.out.println(i);
        }


        System.out.println("******************************");

        String str9 = "String end here";
        String replace = str9.replaceAll("end", "start");
        System.out.println("replace : " + replace);
    }
}
