import java.util.Scanner; //package for scanner 

public class InputInJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // take input form user's
        System.out.print("Enter the value : ");
        int a = sc.nextInt(); // input
        System.out.println("Your entered value is = " + a);
    }
}