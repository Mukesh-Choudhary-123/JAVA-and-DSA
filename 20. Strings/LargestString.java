public class LargestString {
    public static void main(String[] args) {
        String name[] = { "mukesh", "choudhary", "123" };
        String larg = name[0];

        for (int i = 1; i < name.length; i++) {
            if (larg.compareTo(name[i]) < 0) {
                larg = name[i];
            }
        }
        System.out.println(larg);
    }
}
/*
 * OUTPUT:=
 * 
 * mukesh
 * 
 */