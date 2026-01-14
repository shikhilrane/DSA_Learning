package _15_Strings._04_String_concatenation;

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String fName = scn.nextLine();
        System.out.print("Enter your last name : ");
        String lName = scn.nextLine();

        System.out.println("Your full name is " + fName + " " + lName);
    }
}

/*
    here, + is used to concat Strings
 */