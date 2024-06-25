package Arrays;

import java.util.Scanner;

public class PyramidStarDesign1 {

    public static void main(String[] args) {

        System.out.println();
        System.out.print(" Enter number of pyramid rows : ");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        for (int i = 0; i < row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}