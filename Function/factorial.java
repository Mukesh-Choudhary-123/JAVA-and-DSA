import java.util.Scanner;

public class factorial {

    // No Return with Argument...!!

    // function definition (Formal parameter or parameter )
    public static void Calculatefact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial is = " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        Calculatefact(n); // function calling (actual value or agrument)
    }
}

/*
 * OUTPUT:=
 * 
 * Enter any number : 5
 * Factorial is = 120
 * 
 */
