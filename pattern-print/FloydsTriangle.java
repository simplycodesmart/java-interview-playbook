/**
 * Problem Statement:
 * Print Floyd's Triangle.
 *
 * Example (n = 5):
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class FloydsTriangle {

    public static void main(String[] args) {

        // Number of rows
        int max = 5;

        // Tracks current number
        int count = 1;

        // Controls rows
        for (int i = 0; i < max; i++) {

            // Print numbers for current row
            for (int j = 0; j <= i; j++) {

                System.out.print(count + " ");

                // Increment number
                count++;
            }

            // Move to next row
            System.out.println();
        }
    }
}