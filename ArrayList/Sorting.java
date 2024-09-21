import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(21);
        list.add(4);
        list.add(78);
        list.add(56);
        list.add(11);
        list.add(13);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());

        System.err.println(list);
    }
}
