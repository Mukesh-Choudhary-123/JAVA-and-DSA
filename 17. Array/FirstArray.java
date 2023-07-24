import java.util.Scanner;

public class FirstArray {
    public static void main(String[] args) {
        // Operation's on Array

        // ...... create :=
        // int arr[] = new int[10];
        // int arr2[] = { 1, 2, 4, 6, };

        // ...... input :=

        int array[] = new int[10];
        Scanner sc = new Scanner(System.in);

        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();

        // System.out.println("Enter the value's in array : ");
        // for (int i = 0; i <= 10; i++) {
        // array[i] = sc.nextInt();
        // }

        // ........output:=

        // System.out.println(array[0]);
        // System.out.println(array[1]);
        // System.out.println(array[2]);

        // ...........update
        array[2] = array[2] + 3;

        System.out.println("value's in array :");
        for (int j = 0; j <= 3; j++) {
            System.out.println(array[j]);
        }
    }
}

/*
 * OUTPUT
 * 
 * 3
 * 5
 * 6
 * value's in array :
 * 3
 * 5
 * 9
 * 
 * 
 */