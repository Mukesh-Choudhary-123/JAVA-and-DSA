public class SubArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total numbers of sub array : " + tp);
    }
}

/*
 * OUTPUT:=
 * 
 * Total numbers of sub array : 21
 * 
 */