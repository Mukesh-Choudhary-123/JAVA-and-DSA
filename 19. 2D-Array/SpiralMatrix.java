// public class SpiralMatrix {
//     public static void main(String[] args) {
//         int matrix[][] = { { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 },
//                 { 17, 18, 19, 20 } };

//         int top = 0, bottom = matrix.length - 1;
//         int left = 0, right = matrix[0].length - 1;

//         while (top <= bottom && left <= right) {

//             // top
//             for (int i = left; i <= right; i++) {
//                 System.out.print(matrix[top][i] + " ");
//             }
//             top++;

//             // right
//             for (int i = top; i <= bottom; i++) {
//                 System.out.print(matrix[i][right] + " ");
//             }
//             right--;

//             if (top <= bottom && left <= right) {
//                 break;
//             }

//             // bottm
//             for (int i = right; i >= left; i--) {
//                 System.out.print(matrix[bottom][i] + " ");
//             }
//             bottom--;

//             // left
//             for (int i = bottom; i >= top; i--) {
//                 System.out.print(matrix[i][left] + " ");
//             }
//             left++;

//         }
//     }
// }

public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 }
        };

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // top
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // right
            if (top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " ");
                }
                right--;
            }

            // bottom
            if (left <= right) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // left
            if (top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
/*
 * OUTPUT:=
 * 
 * 1 2 3 4 8 12 16 20 19 18 17 13 9 5 6 7 11 15 14 10
 */
