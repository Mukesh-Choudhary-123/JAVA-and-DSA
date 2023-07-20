//Question : Write a Java program that takes a year from the user and print whether that year is a leap year or not 

import java.util.Scanner;

public class FindLeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year : ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year......!!");
                } else {
                    System.out.println("Not Leap Year.....!");
                }
            } else {
                System.out.println("Not Leap Year.....!");
            }
        } else {
            System.out.println("Not Leap Year.....!");
        }
    }
}