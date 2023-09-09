package Q3;

import java.util.Arrays;

public class OddSqrSum {
	public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};

        // Filter odd numbers, square them, and find their sum using streams
        int sum = Arrays.stream(input)
                .filter(number -> number % 2 != 0)  // Filter odd numbers
                .map(number -> number * number)     // Square the numbers
                .sum();                              // Find the sum

        System.out.println("ODD NUMBERS: [1, 3, 5]");
        System.out.println("SQUARES: [1, 9, 25]");
        System.out.println("SUM: " + sum); // Output the sum
    }
}

