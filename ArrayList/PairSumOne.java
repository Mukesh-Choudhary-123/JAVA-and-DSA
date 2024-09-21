import java.util.*;

public class PairSumOne {

    public static void BruteForceApproach(ArrayList<Integer> arr, int traget) {

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == traget) {
                    System.out.println("Index :- " + "[" + i + "," + j + "]");
                }
            }
        }

    }

    public static void TwoPointerApproach(ArrayList<Integer> arr, int traget) {
        int lp = 0;
        int rp = arr.size() - 1;

        while (lp != rp) {
            if (arr.get(lp) + arr.get(rp) == traget) {
                System.out.println("Index :- " + "[" + lp + "," + rp + "]");
            }

            if (arr.get(lp) + arr.get(rp) < traget) {
                lp++;
            } else {
                rp--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println("BruteForceApproach");
        BruteForceApproach(arr, 8);
        System.out.println("TwoPointerApproach");
        TwoPointerApproach(arr, 8);
    }
}
