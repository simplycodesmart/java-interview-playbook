/**
 * Problem Statement:
 * Print a butterfly pattern using asterisks.
 *
 * Example (height = 8):
 * *      *
 * **    **
 * ***  ***
 * ********
 * ********
 * ***  ***
 * **    **
 * *      *
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class ButterflyPattern {

    public static void main(String[] args) {

        // Total rows
        int height = 8;

        // Middle point
        int mid = height / 2;

        // ---------- Top ----------
        for (int i = 1; i <= mid; i++) {

            // Controls columns
            for (int j = 1; j <= height; j++) {

                /*
                 * Print stars:
                 * - Left wing
                 * - Right wing
                 */
                if ((j <= i && j <= mid) || j > height - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // ---------- Bottom ----------
        for (int i = mid; i <= height; i++) {

            // Controls columns (reverse)
            for (int j = height; j > 0; j--) {

                /*
                 * Print stars:
                 * - Left wing
                 * - Right wing
                 */
                if ((j > i && j >= mid) || j <= height - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}