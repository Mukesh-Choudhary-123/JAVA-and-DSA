import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        boolean isprime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }

        if (isprime == true) {
            System.out.println("Number is prime ");
        } else {
            System.out.println("Number is Not prime ");
        }
    }
}
