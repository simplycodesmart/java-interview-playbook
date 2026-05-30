/**
 * Problem Statement:
 * Print a hollow right triangle pattern using asterisks.
 *
 * Example (height = 5):
 *
 * *
 * **
 * * *
 * *  *
 * *****
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */

public class HollowTriangle {

    public static void main(String[] args) {

        // Number of rows
        int height = 5;

        // Controls rows
        for (int i = 0; i < height; i++) {

            // Controls columns
            for (int j = 0; j <= i; j++) {

                /*
                 * Print star when:
                 * - First column
                 * - Last column
                 * - Last row
                 */
                if (j == 0 || j == i || i == height - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to next line
            System.out.println();
        }
    }
}