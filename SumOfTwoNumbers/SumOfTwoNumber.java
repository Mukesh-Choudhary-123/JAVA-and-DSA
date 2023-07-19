import java.util.Scanner;

public class SumOfTwoNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of a & b is = " + sum);
    }
}