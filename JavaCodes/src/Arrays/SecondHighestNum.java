package Arrays;

public class SecondHighestNum {

        public static void main(String[] args) {

            int[] numbers = {5, 3, 9, 7, 2, 8, 10, 6};

            int highest = 0;
            int secondHighest = 0;

            for (int number : numbers) {
                if (number > highest) {
                    secondHighest = highest;
                    highest = number;
                } else if (number > secondHighest && number != highest) {
                    secondHighest = number;
                }
            }

            System.out.println("The second highest number is: " + secondHighest);
        }
    }


