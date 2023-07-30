import java.util.Scanner;

public class clearIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter the ith value : ");
        int i = sc.nextInt();

        int bitmask = ~(1 << i);
        int clearbit = n & bitmask;
        System.out.println(clearbit);
    }
}
/*
 * output:=
 * 
 * Enter a number : 10
 * Enter the ith value : 1
 * 8
 */