/**
 * Problem Statement:
 * Print a diamond pattern using asterisks.
 *
 * Example (level = 10):
 *      *
 *     ***
 *    *****
 *   *******
 *  *********
 * ***********
 *  *********
 *   *******
 *    *****
 *     ***
 *      *
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class DiamondPattern {

    public static void main(String[] args) {

        // Total number of rows
        int level = 10;

        // Middle point
        int mid = level / 2;

        // ---------- Top Pyramid ----------
        for (int i = 0; i < mid; i++) {

            // Print spaces
            for (int j = i; j < mid; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // ---------- Bottom Inverted Pyramid ----------
        for (int i = mid - 1; i > 0; i--) {

            // Print spaces
            for (int j = 0; j <= mid - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}