/**
 * Problem Statement:
 * Print a hollow diamond pattern using asterisks.
 *
 * Example (level = 10):
 *
 *      *
 *     * *
 *    *   *
 *   *     *
 *  *       *
 *   *     *
 *    *   *
 *     * *
 *      *
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class HollowDiamond {

    public static void main(String[] args) {

        // Total rows
        int level = 10;

        // Middle point
        int mid = level / 2;

        // ---------- Top ----------
        for (int i = 0; i < mid; i++) {

            // Print leading spaces
            for (int j = i; j < mid; j++) {
                System.out.print(" ");
            }

            // Print hollow stars
            for (int k = 0; k < (2 * i + 1); k++) {

                // First or last position
                if (k == 0 || k == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // ---------- Bottom ----------
        for (int i = mid - 1; i > 0; i--) {

            // Print leading spaces
            for (int j = 0; j <= mid - i; j++) {
                System.out.print(" ");
            }

            // Print hollow stars
            for (int k = 0; k < (2 * i - 1); k++) {

                // First or last position
                if (k == 0 || k == (2 * i - 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}