/**
 * Problem Statement:
 * Print a snake pattern using numbers.
 *
 * Example (n = 5):
 * 1  2  3  4  5
 * 10 9  8  7  6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class SnakePattern {

    public static void main(String[] args) {

        // Matrix size
        int n = 5;

        // Current number
        int count = 1;

        // Controls rows
        for (int i = 0; i < n; i++) {

            // Even rows → left to right
            if (i % 2 == 0) {

                for (int j = 0; j < n; j++) {
                    System.out.print(count + " ");
                    count++;
                }

            } else {
                // Save row start
                int start = count + n - 1;

                for (int j = 0; j < n; j++) {
                    System.out.print(start + " ");
                    start--;
                    count++;
                }
            }

            System.out.println();
        }
    }
}