package String;
import java.util.Scanner;
public class StringBasics {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str1= scanner.next();
        str1.toLowerCase();

        boolean startsWthS= str1.startsWith("s");
        System.out.println(str1);
        System.out.println("startsWthS : " +startsWthS);
        if(startsWthS == true){
            System.out.println("Its working");
        }
        else System.out.println("Not working");
    }
}
