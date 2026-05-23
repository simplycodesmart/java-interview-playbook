/**
 * Problem Statement:
 * Print a palindrome number pyramid.
 *
 * Example (n = 5):
 *     1
 *    212
 *   32123
 *  4321234
 * 543212345
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class PalindromeNumberPyramid {

    public static void main(String[] args) {

        // Number of rows
        int n = 5;

        // Controls rows
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }

            // Descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            // Move to next row
            System.out.println();
        }
    }
}