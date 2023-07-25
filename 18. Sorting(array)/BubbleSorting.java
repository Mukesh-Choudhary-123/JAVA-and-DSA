public class BubbleSorting {
    public static void main(String[] args) {
        int arr[] = { 6, 5, 89, 67, 23, 9, 48 };
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0)
                break;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
 * OUTPUT:=
 * 
 * 5 6 9 23 48 67 89
 */