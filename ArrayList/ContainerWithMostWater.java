import java.util.ArrayList;

public class ContainerWithMostWater {

    public static void BruteForceWater(ArrayList<Integer> height) {
        int maxWater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int wd = j - i;
                int currWater = ht * wd;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        System.out.print(" Max Water Brute Force : - ");
        System.out.println(maxWater);
    }

    public static void TwoPointerApproach(ArrayList<Integer> height) {

        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int wd = rp - lp;
            int currWater = ht * wd;
            maxWater = Math.max(maxWater, currWater);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        System.out.print(" Max Water (Two Pointer Approach): " + maxWater);

    }

    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        BruteForceWater(height);
        TwoPointerApproach(height);
    }
}
