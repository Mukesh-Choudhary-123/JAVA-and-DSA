public class BinarySeacrh {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 9, 11, 13, 15 };
        int start = 0, end = arr.length - 1, key = 9;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                System.out.println("index is : " + mid);
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}

/*
 * OUTPUT:=
 * 
 * index is : 4
 */