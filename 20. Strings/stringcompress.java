public class stringcompress {
    public static void main(String[] args) {
        String str = "aaabbbcccddd";
        String newstr = "";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count > 1) {
                newstr += count.toString();
            }
        }
        System.out.println(newstr);
    }
}
/*
 * OUTPUT:=
 * 
 * a3b3c3d3
 */