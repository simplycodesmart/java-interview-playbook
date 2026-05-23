/**
 * Problem Statement:
 * Print a repeated number triangle pattern.
 *
 * Example (n = 5):
 * 1
 * 22
 * 333
 * 4444
 * 55555
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class RepeatedNumberTriangle {

    public static void main(String[] args) {

        // Number of rows
        int max = 5;

        // Controls rows
        for (int i = 1; i <= max; i++) {

            // Print current row number repeatedly
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            // Move to next row
            System.out.println();
        }
    }
}