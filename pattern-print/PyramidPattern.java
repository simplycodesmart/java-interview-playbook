/**
 * Problem Statement:
 * Print a pyramid pattern using asterisks.
 *
 * Example (n = 5):
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class PyramidPattern {

    public static void main(String[] args) {

        // Number of rows
        int n = 5;

        // Controls rows
        for (int i = 0; i < n; i++) {

            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            // Formula: (2 * i + 1)
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }

            // Move to next row
            System.out.println();
        }
    }
}