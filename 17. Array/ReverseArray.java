public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 23, 56, 78, 98, 21, 48, 79 };

        int first = 0, last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            last--;
            first++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
 * OUTPUT:=
 * 
 * 79 48 21 98 78 56 23
 * 
 */