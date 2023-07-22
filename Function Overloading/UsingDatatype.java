public class UsingDatatype {

    // calculate the sum of int type :
    public static int sum(int a, int b) {
        return a + b;
    }

    // Calculate the sum of float type:
    public static float sum(float a, float b) {
        return a + b;

    }

    public static void main(String[] args) {

        System.out.println("Sum of int = " + sum(2, 4));

        System.out.println("Sum of float = " + sum(2.5f, 3.5f));
    }
}

/*
 * OUTPUT:=
 * 
 * Sum of int = 6
 * Sum of float = 6.0
 * 
 */