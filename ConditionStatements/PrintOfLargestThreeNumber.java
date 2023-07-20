import java.util.Scanner;

public class PrintOfLargestThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three number's :- ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("A is largest number.");
        } else if (b > a && b > c) {
            System.out.println("B is Largest number.");
        } else {
            System.out.println("C is Largest number.");
        }

    }
}
