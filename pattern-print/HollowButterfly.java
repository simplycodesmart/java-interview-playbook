/**
 * Problem Statement:
 * Print a hollow butterfly pattern using asterisks.
 *
 * Example (height = 8):
 * *      *
 * **    **
 * * *  * *
 * ********
 * ********
 * * *  * *
 * **    **
 * *      *
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class HollowButterfly {

    public static void main(String[] args) {

        // Total rows
        int height = 8;

        // Middle point
        int mid = height / 2;

        // ---------- Top ----------
        for (int i = 1; i <= mid; i++) {

            for (int j = 1; j <= height; j++) {

                if (
                    j == 1 ||
                    j == i ||
                    j == height ||
                    j == height - i + 1
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // ---------- Bottom ----------
        for (int i = mid; i >= 1; i--) {

            for (int j = 1; j <= height; j++) {

                if (
                    j == 1 ||
                    j == i ||
                    j == height ||
                    j == height - i + 1
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}