public class MAXSubArraySum {
    public static void main(String[] args) {
        int current_sum = 0;
        int Max_sum = Integer.MIN_VALUE;
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                current_sum = 0;
                for (int k = start; k <= end; k++) {
                    current_sum += arr[k];
                }
                System.out.println(current_sum);
                if (Max_sum < current_sum) {
                    Max_sum = current_sum;
                }
            }
        }
        System.out.println("Max Sub-Array Sum is : " + Max_sum);
    }
}

/*
 * OUTPUT:=
 * 
 * 2
 * 5
 * 9
 * 14
 * 20
 * 27
 * 3
 * 7
 * 12
 * 18
 * 25
 * 4
 * 9
 * 15
 * 22
 * 5
 * 11
 * 18
 * 6
 * 13
 * 7
 * Max Sub-Array Sum is : 27
 * 
 * 
 */