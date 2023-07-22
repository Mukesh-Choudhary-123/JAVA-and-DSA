import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of row : ");
        int n = sc.nextInt();

        // 1st half
        for (int i = 1; i <= n; i++) {

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}