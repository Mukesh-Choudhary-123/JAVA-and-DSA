public class LargestNumber {

    public static void FindNumber(int arr[]) {
        int num = Integer.MIN_VALUE;
        int num2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (num < arr[i]) {
                num = arr[i];
            }
            if (num2 > arr[i]) {
                num2 = arr[i];
            }
        }
        System.out.println("Smallest value is " + num2);
        System.out.println("largest value is " + num);

    }

    public static void main(String[] args) {
        int arr[] = { 23, 5, 6, 78, 5, 87, 45 };
        FindNumber(arr);
    }
}

/*
 * OUTPUT:=
 * 
 * Smallest value is 5
 * largest value is 87
 * 
 */