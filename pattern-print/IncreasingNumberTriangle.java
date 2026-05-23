/**
 * Problem Statement:
 * Print an increasing number triangle pattern.
 *
 * Example (n = 5):
 * 1
 * 12
 * 123
 * 1234
 * 12345
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class IncreasingNumberTriangle {

    public static void main(String[] args) {

        // Number of rows
        int max = 5;

        // Controls rows
        for (int i = 1; i <= max; i++) {

            // Print numbers from 1 to current row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Move to next row
            System.out.println();
        }
    }
}