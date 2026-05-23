/**
 * Problem Statement:
 * Print Pascal Triangle.
 *
 * Example (n = 5):
 *     1
 *    1 1
 *   1 2 1
 *  1 3 3 1
 * 1 4 6 4 1
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n²)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class PascalTriangle {

    public static void main(String[] args) {

        // Number of rows
        int n = 5;

        // Store previous row values
        int[] previous = new int[n];

        // Controls rows
        for (int i = 0; i < n; i++) {

            // Print spaces
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            // Current row
            int[] current = new int[i + 1];

            // Controls columns
            for (int j = 0; j <= i; j++) {

                // First and last positions
                if (j == 0 || j == i) {
                    current[j] = 1;
                } else {
                    current[j] = previous[j - 1] + previous[j];
                }

                System.out.print(current[j] + " ");
            }

            // Save current row
            previous = current;

            System.out.println();
        }
    }
}