/**
 * Problem Statement:
 * Print a repeated alphabet triangle pattern.
 *
 * Example (n = 5):
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class RepeatedAlphabetPattern {

    public static void main(String[] args) {

        // Number of rows
        int max = 5;

        // Starting character
        char c = 'A';

        // Controls rows
        for (int i = 0; i < max; i++) {

            // Print current character repeatedly
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
            }

            // Move to next alphabet
            c++;

            // Move to next row
            System.out.println();
        }
    }
}