/**
 * Problem Statement:
 * Print a spiral matrix.
 *
 * Example (n = 5):
 * 1   2   3   4   5
 * 16 17 18 19 6
 * 15 24 25 20 7
 * 14 23 22 21 8
 * 13 12 11 10 9
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n²)
 *
 * @author Krishna Kanth Latya
 * @version 1.0
 */
public class SpiralMatrix {

    public static void main(String[] args) {

        int n = 5;

        int[][] matrix = new int[n][n];

        int top = 0;
        int bottom = n - 1;

        int left = 0;
        int right = n - 1;

        int value = 1;

        while (top <= bottom && left <= right) {

            // Left → Right
            for (int j = left; j <= right; j++) {
                matrix[top][j] = value++;
            }
            top++;

            // Top ↓ Bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            // Right ← Left
            for (int j = right; j >= left; j--) {
                matrix[bottom][j] = value++;
            }
            bottom--;

            // Bottom ↑ Top
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }

        // Print matrix
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", matrix[i][j]);
            }

            System.out.println();
        }
    }
}