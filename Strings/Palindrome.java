import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        // Check if String is a palindrome
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the spelling : ");
        String word = sc.nextLine();
        String check = " ";
        for (int i = 0; i < word.length() / 2; i++) {
            int n = word.length();
            if (word.charAt(i) == word.charAt(n - 1 - i)) {
                check = "palindrome";
            } else {
                check = "Not palindrome";
            }
        }
        System.out.println("The " + word + " spelling is " + check);
    }
}
/*
 * 
 * OUTPUT:=
 * 
 * 
 * //first input & output
 * Enter the spelling : racecar
 * The racecar spelling is palindrome
 * 
 * 
 * //second input & output
 * Enter the spelling : Muksa
 * The Muksa spelling is Not palindrome
 * 
 * 
 */