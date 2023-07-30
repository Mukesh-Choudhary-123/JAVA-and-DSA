import java.util.Scanner;

public class SetIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter the ith value : ");
        int i = sc.nextInt();

        int bitmask = 1 << i;
        int setbit = n | bitmask;
        System.out.println(setbit);
    }
}
/*
 * output:=
 * 
 * Enter a number : 10
 * Enter the ith value : 3
 * 10
 */