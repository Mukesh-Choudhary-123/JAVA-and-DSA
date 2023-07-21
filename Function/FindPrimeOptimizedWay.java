import java.util.Scanner;

public class FindPrimeOptimizedWay {

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
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println("Number is " + isprime(n) + " for prime ");
    }
}

/*
 * OUTPUT:=
 * 
 * Enter number : 4
 * Number is false for prime
 * 
 */