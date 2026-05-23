/**
 * Problem Statement:
 * Print an X pattern using numbers.
 *
 * Example (n = 9):
 * 1       1
 *  2     2
 *   3   3
 *    4 4
 *     5
 *    4 4
 *   3   3
 *  2     2
 * 1       1
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class XPattern {

    public static void main(String[] args) {

        // Size of X
        int n = 9;

        // Controls rows
        for (int i = 0; i < n; i++) {

            // Value to print
            int value = i < n / 2
                    ? i + 1
                    : n - i;

            // Controls columns
            for (int j = 0; j < n; j++) {

                if (j == i || j == n - i - 1) {
                    System.out.print(value);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}