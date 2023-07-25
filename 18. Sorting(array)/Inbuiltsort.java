import java.util.Arrays;

public class Inbuiltsort {
    public static void main(String[] args) {
        int arr[] = { 12, 3, 5, 67, 8, 1, 45 };
        Arrays.sort(arr);// inbuilt in java

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
