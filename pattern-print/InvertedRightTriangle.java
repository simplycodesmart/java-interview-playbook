/**
 * Problem Statement:
 * Print an inverted right triangle pattern using asterisks.
 *
 * Example (n = 5):
 * *****
 * ****
 * ***
 * **
 * *
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class InvertedRightTriangle {

    public static void main(String[] args) {

        // Number of rows
        int n = 10;

        // Controls rows in reverse order
        for (int i = n; i > 0; i--) {

            // Prints stars for current row
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}