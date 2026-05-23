/**
 * Problem Statement:
 * Print an inverted pyramid pattern using asterisks.
 *
 * Example (n = 5):
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class InvertedPyramid {

    public static void main(String[] args) {

        // Number of rows
        int level = 5;

        // Controls rows from top to bottom
        for (int i = level; i > 0; i--) {

            // Print leading spaces
            for (int k = 0; k < level - i; k++) {
                System.out.print(" ");
            }

            // Print stars
            // Formula: (2 × i - 1)
            for (int j = 0; j < (i * 2 - 1); j++) {
                System.out.print("*");
            }

            // Move to next row
            System.out.println();
        }
    }
}