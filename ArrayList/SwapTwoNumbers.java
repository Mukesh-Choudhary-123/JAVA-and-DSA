import java.util.ArrayList;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);

        System.out.println(list);

        int idx1 = 1, idx2 = 3;

        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        System.out.println(list);
    }
}
