import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        while (n > 0) {
            int last_number = n % 10;
            System.out.print(last_number + " ");
            n = n / 10;
        }
    }
}
