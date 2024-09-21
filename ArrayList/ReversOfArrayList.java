import java.util.ArrayList;

/**
 * ReversOfArrayList
 */
public class ReversOfArrayList {

    public static void main(String[] args) {

        // ArrayList<Interger> Name of array = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print(list);
        System.out.println();

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

    }
}