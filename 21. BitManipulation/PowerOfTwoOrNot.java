import java.util.Scanner;

public class PowerOfTwoOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if ((n & (n - 1)) == 0) {
            System.out.println("ture");
        } else {
            System.out.println("false");
        }
    }
}
/*
 * output:=
 * 
 * Enter a number : 4
 * ture
 * 
 * Enter a number : 3
 * false
 * 
 */