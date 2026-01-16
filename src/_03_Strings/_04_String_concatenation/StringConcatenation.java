package _03_Strings._04_String_concatenation;

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String fName = scn.nextLine();
        System.out.print("Enter your last name : ");
        String lName = scn.nextLine();

        System.out.println("Your full name is " + fName + " " + lName);

        System.out.println("Xyz" + 10 + 20);    // Operation goes from left to right so it will add "Xyz" and 10 first, so it will become "Xyz10" then 20
        System.out.println("Xyz" + (10 + 20));  // Explicitly telling to add 10 and 20 together by using brackets
        System.out.println(10 + 20 + "Xyz");
        System.out.println(10 + (20 + "Xyz"));
    }
}

/*
    here, + is used to concat Strings
 */