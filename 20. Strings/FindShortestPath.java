public class FindShortestPath {
    public static void main(String[] args) {
        int x = 0, y = 0;
        float ShortestPath = 0;
        String path = "WNEENESENNN";
        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);

            if (ch == 'S') {
                y--;
            } else if (ch == 'N') {
                y++;
            } else if (ch == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int y2 = y * y;
        int x2 = x * x;
        ShortestPath = (float) Math.sqrt(x2 + y2);
        System.out.println(ShortestPath);
    }
}
/*
 * OUTPUT:=
 * 
 * 5.0
 * 
 */