import java.util.Scanner;

public class GetIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter the ith value : ");
        int i = sc.nextInt();

        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}
/*
 * output:=
 * 
 * Enter a number : 10
 * Enter the ith value : 3
 * 1
 */