/**
 * Problem Statement:
 * Print a binary triangle pattern.
 *
 * Example (n = 5):
 * 1
 * 01
 * 101
 * 0101
 * 10101
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class BinaryTriangle {

    public static void main(String[] args) {

        // Number of rows
        int n = 5;

        // Controls rows
        for (int i = 1; i <= n; i++) {

            // Controls columns
            for (int j = 1; j <= i; j++) {

                // Alternate using row + column
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            // Move to next row
            System.out.println();
        }
    }
}