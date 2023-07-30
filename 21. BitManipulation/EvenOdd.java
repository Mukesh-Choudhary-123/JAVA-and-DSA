import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check even or odd : ");
        int n = sc.nextInt();

        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
/*
 * OUTPUT:=
 * 
 * Enter a number to check even or odd : 4
 * Even number
 * 
 * 
 * Enter a number to check even or odd : 3
 * Odd number
 */