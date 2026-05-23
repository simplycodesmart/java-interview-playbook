/**
 * Problem Statement:
 * Print an inverted left triangle pattern using asterisks.
 *
 * Example (n = 5):
 * *****
 *  ****
 *   ***
 *    **
 *     *
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class InvertedLeftTriangle {

    public static void main(String[] args) {

        // Number of rows
        int n = 5;

        // Controls rows
        for (int i = 0; i < n; i++) {

            // Print leading spaces
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}   