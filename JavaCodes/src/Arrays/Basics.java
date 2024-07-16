package Arrays;

public class Basics {
        public static void main(String[] args) {
            // For loop
//            for (int i = 0; i < 5; i++) {
//                System.out.println("For Loop - Iteration: " + i);
//            }

            // While loop
//            int j = 0;
//            while (j < 5) {
//                System.out.println("While Loop - Iteration: " + j);
//                j++;
//            }

            // Do-while loop
            int k = 0;
            do {
                System.out.println("Do-While Loop - Iteration: " + k);
                k++;
            } while (k < 5);

            // Enhanced for loop
            int[] array = {1, 2, 3, 4, 5};
            for (int num : array) {
                System.out.println("Enhanced For Loop - Number: " + num);
            }
        }
    }


