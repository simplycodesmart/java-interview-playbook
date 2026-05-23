/**
 * Right Triangle Star Pattern
 *
 * Prints:
 * *
 * **
 * ***
 * ****
 * ...
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class RightTriangle {

    public static void main(String[] args) {

        // Number of rows in the triangle
        int n = 10;

        // Controls each row
        for (int i = 1; i <= n; i++) {

            // Prints stars for current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}