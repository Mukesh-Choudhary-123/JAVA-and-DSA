import java.util.Scanner;

public class DecimalToBinary {

    public static void DectoBin(int n) {
        int pow = 0;
        int bin = 0;

        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary is : " + bin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int n = sc.nextInt();
        DectoBin(n);
    }
}

/*
 * OUTPUT:=
 * 
 * Enter the decimal number : 7
 * binary is : 111
 * 
 */
