package Arrays;

public class MultiDimensionalArray{
    public static void main(String[] args) {
        // Declaring and initializing a 2D array
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing elements of the 2D array
        System.out.println("Elements of the 2D array:");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}