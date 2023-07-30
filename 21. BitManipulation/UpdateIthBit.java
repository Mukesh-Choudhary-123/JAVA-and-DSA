import java.util.Scanner;

public class UpdateIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter the ith value : ");
        int i = sc.nextInt();
        System.out.print("Enter the new bit : ");
        int nb = sc.nextInt();

        if (nb == 0) {

            int bitmask = ~(1 << i);
            int clearbit = n & bitmask;
            System.out.println(clearbit);

        } else {

            int bitmask = 1 << i;
            int setbit = n | bitmask;
            System.out.println(setbit);

        }
    }
}
/*
 * output:=
 * 
 * Enter a number : 10
 * Enter the ith value : 2
 * Enter the new bit : 1
 * 14
 * 
 */