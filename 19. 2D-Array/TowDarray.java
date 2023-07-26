import java.util.Scanner;

public class TowDarray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element in 2D Array  : ");
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix.length - 1; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Element's in 2D Array :");
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix.length - 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
 * OUTPUT:=
 * 
 * Enter the element in 2D Array :
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Element's in 2D Array :
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 */