/**
 * Problem Statement:
 * Print a spiral square (concentric number) pattern.
 *
 * Example (n = 5):
 * 11111
 * 12221
 * 12321
 * 12221
 * 11111
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class SpiralSquarePattern {

    public static void main(String[] args) {

        // Size of square
        int n = 5;

        // Controls rows
        for (int i = 0; i < n; i++) {

            // Controls columns
            for (int j = 0; j < n; j++) {

                // Distance from each border
                int top = i;
                int left = j;
                int bottom = n - 1 - i;
                int right = n - 1 - j;

                // Find nearest border
                int layer = Math.min(
                        Math.min(top, bottom),
                        Math.min(left, right));

                // Print layer value
                System.out.print(layer + 1);
            }

            // Move to next row
            System.out.println();
        }
    }
}