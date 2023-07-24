public class MaxSum {
    public static void main(String[] args) {
        int current_sum = 0;
        int Max_sum = Integer.MIN_VALUE;
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                current_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

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
 * Max Sub-Array Sum is : 27
 */