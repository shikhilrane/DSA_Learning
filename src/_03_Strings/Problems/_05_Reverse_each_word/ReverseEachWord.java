package _03_Strings.Problems._05_Reverse_each_word;

// Given a sentence, reverse the every word of the sentence

public class ReverseEachWord {
    public static void main(String[] args) {
        String string = "I am grinding Leetcode";

        reverseWord(string);

    }

    public static void reverseWord(String str){
        StringBuilder sb = new StringBuilder();     // stores current word
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);                      // build word
            } else {
                sb.reverse();                       // reverse word
                ans = ans + sb + " ";               // add to answer
                sb.setLength(0);                    // clear StringBuilder
            }
        }

        // handle last word (no space after it)
        sb.reverse();
        ans = ans + sb;

        System.out.println(ans);
    }
}
