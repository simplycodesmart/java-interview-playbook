/**
 * Problem Statement:
 * Print a continuous alphabet triangle pattern.
 *
 * Example (n = 5):
 * A
 * BC
 * DEF
 * GHIJ
 * KLMNO
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class ContinuousAlphabetPattern {

    public static void main(String[] args) {

        // Number of rows
        int max = 5;

        // Starting alphabet
        char c = 'A';

        // Controls rows
        for (int i = 0; i < max; i++) {

            // Print characters continuously
            for (int j = 0; j <= i; j++) {

                System.out.print(c);

                // Move to next alphabet
                c++;
            }

            // Move to next row
            System.out.println();
        }
    }
}