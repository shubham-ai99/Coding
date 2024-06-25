package Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        System.out.println(" Array elements ");
        int b[] = {11, 22, 33, 44};//declaration, instantiation and initialization
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        System.out.println(" Reverse Array elements ");
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.println(b[i]);
        }

    }
}
