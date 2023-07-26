public class StaircaseSearch {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int key = 14, row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found key at :" + "(" + row + "," + col + ")");
                break;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
    }
}
/*
 * OUTPUT:=
 * 
 * Found key at :(3,1)
 * 
 * 
 */
