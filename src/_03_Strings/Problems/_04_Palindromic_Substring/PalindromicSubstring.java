package _03_Strings.Problems._04_Palindromic_Substring;

public class PalindromicSubstring {
    public static void main(String[] args) {
        String str = "aa";

        PalindromicSubstr(str);
    }

    public static void PalindromicSubstr(String str){
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                if (isPalindrome(str) == true) {
                    System.out.print(str.substring(i,j) + " ");
                    count++;
                }
            }
            System.out.println();
        }

        System.out.println("Number of total Palindromic Substrings are " + count);
    }

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;

        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
