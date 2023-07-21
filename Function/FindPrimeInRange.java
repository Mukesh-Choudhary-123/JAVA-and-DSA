import java.util.Scanner;

public class FindPrimeInRange {

    public static void PrimeInRange(int n) {

        System.out.print("Range is = ");
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to find pirme number from 2 to : ");
        int n = sc.nextInt();
        PrimeInRange(n);
    }
}

/*
 * OUTPUT:=
 * 
 * Enter the range to find pirme number from 2 to : 20
 * Range is = 2 3 5 7 11 13 17 19
 * 
 */