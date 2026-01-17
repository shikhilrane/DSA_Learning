package _03_Strings.Problems._06_Compress_Given_String;

// Given a String

public class Compress {
    public static void main(String[] args) {
        String str = "aaabbbbccddde";

        compressString(str);
    }

    public static void compressString(String str){
        String ans = "" + str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char previousChar = str.charAt(i-1);
            if (currentChar == previousChar) {
                count++;
            }else {
                if (count > 1){
                    ans = ans + count;
                }
                count = 1;
                ans = ans + currentChar;
            }
        }

        if (count > 1){
            ans = ans + count;
        }

        System.out.println(ans);
    }
}
