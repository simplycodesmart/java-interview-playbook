public class HollowTriangle {
    public static void main(String[] args) {
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == height - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();

        }

    }

}
