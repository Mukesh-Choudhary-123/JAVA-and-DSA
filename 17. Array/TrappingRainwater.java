public class TrappingRainwater {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };

        // Calulate left MAX boundary array
        int leftmax[] = new int[arr.length];
        leftmax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }

        // Calculate right MAX boundary array
        int rightmax[] = new int[arr.length];
        rightmax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }

        int trappedwater = 0;

        for (int i = 0; i < arr.length; i++) {

            // Water leve = min(leftmax, rightmax)
            int Waterleve = Math.min(leftmax[i], rightmax[i]);

            // Trappedwater water = waterlevel - arr(height)[i]
            trappedwater = trappedwater + Waterleve - arr[i];
        }
        System.out.println(trappedwater);

    }
}

/*
 * 
 * OUTPUT:=
 * 
 * 11
 * 
 * 
 */