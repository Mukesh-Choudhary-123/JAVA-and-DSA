import java.util.Scanner;

public class ReverseOFNumSecondMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int reverse = 0;
        while (n > 0) {
            int last_number = n % 10;
            reverse = reverse * 10 + last_number;
            n = n / 10;
        }
        System.out.print(reverse + " ");
    }
}