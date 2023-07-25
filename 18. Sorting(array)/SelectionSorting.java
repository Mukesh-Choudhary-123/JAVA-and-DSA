public class SelectionSorting {
    public static void main(String[] args) {
        int arr[] = { 23, 54, 7, 1, 12, 21, 36 };
        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
 * OUTPUT:=
 * 
 * 1 7 12 21 23 36 54
 */