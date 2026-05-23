/**
 * Problem Statement:
 * Print a square pattern using numbers.
 *
 * Example (n = 5):
 * 1  2  3  4  5
 * 6  7  8  9  10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class SquarePatternNumbers {

    public static void main(String[] args) {

        // Size of square
        int n = 5;

        // Tracks current number to print
        int count = 1;

        // Controls rows
        for (int i = 0; i < n; i++) {

            // Controls columns
            for (int j = 0; j < n; j++) {

                // Print current number
                System.out.print(count + " ");

                // Move to next number
                count++;
            }

            // Move to next row
            System.out.println();
        }
    }
}