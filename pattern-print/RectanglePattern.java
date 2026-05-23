/**
 * Problem Statement:
 * Print a rectangle pattern using asterisks.
 *
 * Example:
 * **********
 * **********
 * **********
 * **********
 * **********
 *
 * Time Complexity: O(length × width)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class RectanglePattern {

    public static void main(String[] args) {

        // Number of columns
        int len = 10;

        // Number of rows
        int wid = 5;

        // Controls rows
        for (int i = 0; i < wid; i++) {

            // Prints stars in each row
            for (int j = 0; j < len; j++) {
                System.out.print("*");
            }

            // Move to next row
            System.out.println();
        }
    }
}