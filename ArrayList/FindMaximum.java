import java.util.ArrayList;

public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int maxNum = Integer.MIN_VALUE;

        list.add(6);
        list.add(2);
        list.add(54);
        list.add(40);
        list.add(5);

        for (int i = 0; i < list.size(); i++) {
            maxNum = Math.max(maxNum, list.get(i));
        }

        System.out.println(maxNum);
    }
}
