/**
 * Problem Statement:
 * Print a square pattern using asterisks.
 *
 * Example (n = 5):
 * *****
 * *****
 * *****
 * *****
 * *****
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class SquarePatternAsterisk {

    public static void main(String[] args) {

        // Size of square (rows and columns)
        int n = 5;

        // Controls rows
        for (int i = 0; i < n; i++) {

            // Prints stars in each row
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}