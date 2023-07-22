import java.util.Scanner;

public class FloydsPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of row : ");
        int n = sc.nextInt();

        int conuter = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(conuter);
                conuter++;
            }
            System.out.println();
        }
    }
}
