public class UsingParameter {

    // calculate 2 number
    public static int sum(int a, int b) {
        return a + b;
    }

    // Calculate 3 number
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println("sum of two number is = " + sum(2, 3));

        System.out.println("sum of three number is = " + sum(2, 3, 4));

    }
}

/*
 * OUTPUT:=
 * 
 * sum of two number is = 5
 * sum of three number is = 9
 * 
 */