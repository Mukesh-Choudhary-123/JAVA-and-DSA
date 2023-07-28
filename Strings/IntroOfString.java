import java.util.Scanner;

public class IntroOfString {
    public static void main(String[] args) {

        String str = "Mukesh Choudhary-123";
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String str2 = sc.nextLine();

        System.out.println("Your name is : " + str2);

    }
}
/*
 * OUTPUT:=
 * 
 * Mukesh Choudhary-123
 * Enter your name : Mukesh Choudhary
 * Your name is : Mukesh Choudhary
 * 
 */