/**
 * Problem Statement:
 * Print a plus (+) pattern using asterisks.
 *
 * Example (n = 5):
 *   *
 *   *
 * *****
 *   *
 *   *
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class PlusPattern {

    public static void main(String[] args) {

        // Size of plus
        int row = 5;

        // Middle index
        int mid = row / 2;

        // Controls rows
        for (int i = 0; i < row; i++) {

            // Controls columns
            for (int j = 0; j < row; j++) {

                /*
                 * Print star:
                 * - Middle row
                 * - Middle column
                 */
                if (i == mid || j == mid) {
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