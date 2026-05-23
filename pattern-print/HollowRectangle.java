/**
 * Problem Statement:
 * Print a hollow rectangle pattern using asterisks.
 *
 * Example:
 * **********
 * *        *
 * *        *
 * *        *
 * **********
 *
 * Time Complexity: O(width × length)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class HollowRectangle {

    public static void main(String[] args) {

        // Number of columns
        int len = 10;

        // Number of rows
        int wid = 5;

        // Controls rows
        for (int i = 0; i < wid; i++) {

            // Controls columns
            for (int j = 0; j < len; j++) {

                /*
                 * Print star for borders:
                 * - First row
                 * - Last row
                 * - First column
                 * - Last column
                 */
                if (i == 0 || i == wid - 1 || j == 0 || j == len - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to next row
            System.out.println();
        }
    }
}