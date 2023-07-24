import java.util.Scanner;

public class LinearSearch {

    public static int FindElement(int aar[], int key) {

        for (int i = 0; i < aar.length; i++) {
            if (aar[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // .............size of Array
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // ............enter element in array
        System.out.println("Enter the element in array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // ..................Key
        System.out.print("Enter the key : ");
        int key = sc.nextInt();

        // .........calling to function
        int index = FindElement(arr, key);
        if (index == -1) {
            System.out.println("NOT FOUND....!");
        } else {
            System.out.println("The index is : " + index);
        }

    }
}

/*
 * OUTPUT:=
 * 
 * Enter the size of array : 5
 * Enter the element in array :
 * 12
 * 23
 * 45
 * 56
 * 78
 * Enter the key : 56
 * The index is : 3
 * 
 */
