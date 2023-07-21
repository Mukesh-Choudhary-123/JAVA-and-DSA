import java.util.Scanner;

public class BinomialCoefficient {

    // formula of Binomial coefficient = n!/r!(n-r)!

    // Calculate factorial
    public static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;

    }

    // Calculate binomial Coefficient
    public static void BinomialCoeff(int n, int r) {

        // n!
        int n_fact = fact(n);

        // r!
        int r_fact = fact(r);

        // (n-r)!
        int nmr_fact = fact(n - r);

        // apply formula
        int bc = n_fact / (r_fact * nmr_fact);

        System.out.print("Binomial Coefficient is = " + bc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input form user value's of n & r
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r = ");
        int r = sc.nextInt();

        BinomialCoeff(n, r); // function calling
    }
}

/*
 * OUTPUT:=
 * 
 * 
 * Enter the value of n = 5
 * Enter the value of r = 2
 * Binomial Coefficient is = 10
 * 
 * 
 */