import java.util.*;

public class PairSumTwo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        int traget = 16;

        System.out.println(arr);
        System.out.println("Traget :- " + traget);

        // Brute Force is same as pair sum 1 calculate all possible sum the find out max
        // sum

        // Two Pointer Approach

        int breakPoint = -1;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                breakPoint = i;
                break;
            }
        }

        int lp = breakPoint + 1;
        int rp = breakPoint;

        while (lp != rp) {
            if (arr.get(lp) + arr.get(rp) == traget) {
                System.out.println("Index :- " + "[" + lp + "," + rp + "]");
            }

            if (arr.get(lp) + arr.get(rp) < traget) {
                lp = (lp + 1) % arr.size();
            } else {
                rp = (arr.size() + rp - 1) % arr.size();
            }
        }

    }
}
