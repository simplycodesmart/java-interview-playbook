/**
 * Problem Statement:
 * Print a sandglass (hourglass) pattern using asterisks.
 *
 * Example (n = 5):
 * *********
 *  *******
 *   *****
 *    ***
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
public class SandglassPattern {

    public static void main(String[] args) {

        // Number of levels
        int n = 5;

        // ---------- Top (Inverted Pyramid) ----------
        for (int i = n; i >= 1; i--) {

            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // ---------- Bottom (Pyramid) ----------
        for (int i = 2; i <= n; i++) {

            // Print leading spaces
            for (int j = n - i; j > 0; j--) {
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