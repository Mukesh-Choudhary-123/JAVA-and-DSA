import java.util.Scanner;

public class BinaryToDecimal {

    public static void BintoDec(int n) {
        int pow = 0;
        int dec = 0;

        while (n > 0) {
            int lastnumber = n % 10;
            dec = dec + (lastnumber * (int) Math.pow(2, pow));

            pow++;
            n = n / 10;
        }
        System.out.println("Decimal number is : " + dec);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary number : ");
        int n = sc.nextInt();
        BintoDec(n);
    }
}

/*
 * OUTPUT:=
 * 
 * Enter the Binary number : 101
 * Decimal number is : 5
 * 
 */