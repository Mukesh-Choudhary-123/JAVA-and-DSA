public class InsertionSorting {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 1, 10, 9, 56, 16, 25, 5 };

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
 * OUTPUT:=
 * 
 * 1 3 5 6 9 10 16 25 56
 * 
 */