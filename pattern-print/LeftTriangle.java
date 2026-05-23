/**
 * Problem Statement:
 * Print a left triangle pattern using asterisks.
 *
 * Example (n = 5):
 *     *
 *    **
 *   ***
 *  ****
 * *****
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class LeftTriangle {

    public static void main(String[] args) {

        // Number of rows
        int n = 10;

        // Controls rows
        for (int i = 0; i < n; i++) {

            // Controls columns
            for (int j = 0; j < n; j++) {

                // Print star after reaching triangle boundary
                if (j >= n - i - 1) {
                    System.out.print("*");
                } else {
                    // Print leading spaces
                    System.out.print(" ");
                }
            }

            // Move to next row
            System.out.println();
        }
    }
}   