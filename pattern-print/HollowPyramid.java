/**
 * Problem Statement:
 * Print a hollow pyramid pattern using asterisks.
 *
 * Example (n = 5):
 *     *
 *    * *
 *   *   *
 *  *     *
 * *********
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class HollowPyramid {

    public static void main(String[] args) {

        // Number of rows
        int level = 5;

        // Controls rows
        for (int i = 0; i < level; i++) {

            // Print leading spaces
            for (int j = i; j < level - 1; j++) {
                System.out.print(" ");
            }

            // Print stars / inner spaces
            for (int k = 1; k <= (2 * i + 1); k++) {

                /*
                 * Print star when:
                 * 1. First position
                 * 2. Last position
                 * 3. Last row (base of pyramid)
                 */
                if (k == 1 || k == (2 * i + 1) || i == level - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to next row
            System.out.println();
        }
    }
}