package Arrays;

public class StarPattern1 {

    public static void main(String[] args) {

        int num = 5;

        for (int i = 1; i <= num; i++) {
            System.out.println();
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
        }

        for (int i = num; i <= 1 ; i--) {
            System.out.println();
            for (int j = num; j <=i; j++) {
                System.out.print("*");
            }
        }
    }
}