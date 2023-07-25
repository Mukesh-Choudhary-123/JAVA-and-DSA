public class CountingSorting {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 5, 3, 2, 1, 5, 2, 3, 4, 5, 3, 2, 4, 5, 3, 1, 4 };

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
 * OUTPUT:=
 * 
 * 1 1 1 2 2 2 3 3 3 3 3 4 4 4 5 5 5 5 5 6
 * 
 */