/**
 * Problem Statement:
 * Print an alphabet triangle pattern.
 *
 * Example (n = 5):
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class AlphabetTriangle {

    public static void main(String[] args) {

        // Number of rows
        int max = 5;

        // Controls rows
        for (int i = 0; i < max; i++) {

            // Starting character for each row
            char ch = 'A';

            // Print characters
            for (int j = 0; j <= i; j++) {

                System.out.print(ch);

                // Move to next alphabet
                ch++;
            }

            // Move to next line
            System.out.println();
        }
    }
}