import java.util.Scanner;

public class InvertedandRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // loop for row's

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // star
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
