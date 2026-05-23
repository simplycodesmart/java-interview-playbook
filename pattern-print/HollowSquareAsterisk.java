/**
 * Problem Statement:
 * Print a hollow square pattern using asterisks.
 *
 * Example (n = 5):
 * *****
 * *   *
 * *   *
 * *   *
 * *****
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class HollowSquareAsterisk {

    public static void main(String[] args) {

        // Size of square
        int n = 5;

        // Last row / column index
        int max = n - 1;

        // Traverse rows
        for (int i = 0; i < n; i++) {

            // Traverse columns
            for (int j = 0; j < n; j++) {

                // Print star for borders
                if (i == 0 || i == max || j == 0 || j == max) {
                    System.out.print("*");
                } else {
                    // Print space inside square
                    System.out.print(" ");
                }
            }

            // Move to next row
            System.out.println();
        }
    }
}