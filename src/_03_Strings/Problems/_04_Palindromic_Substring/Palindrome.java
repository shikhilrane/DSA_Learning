package _03_Strings.Problems._04_Palindromic_Substring;

// Given a String, return the number of palindromic substring in it.

public class Palindrome {
    public static void main(String[] args) {
        String str = "ABCBA";

        palindromeString(str);
    }

    public static void palindromeString(String str){
        int i = 0;
        int j = str.length()-1;

        boolean flag = true;

        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if (flag) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
