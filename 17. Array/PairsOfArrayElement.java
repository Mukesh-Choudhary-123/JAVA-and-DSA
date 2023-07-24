public class PairsOfArrayElement {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        int tp = 0;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + current + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number's of pair's is : " + tp);
    }
}

/*
 * OUTPUT:=
 * 
 * (2,3)(2,4)(2,5)(2,6)
 * (3,4)(3,5)(3,6)
 * (4,5)(4,6)
 * (5,6)
 * 
 * Total number's of pair's is : 10
 */