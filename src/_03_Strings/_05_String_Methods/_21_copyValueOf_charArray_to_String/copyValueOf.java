package _03_Strings._05_String_Methods._21_copyValueOf_charArray_to_String;

// Use to convert character array into StringClass

public class copyValueOf {
    public static void main(String[] args) {
        char c[] = {'H','e','l','l','o',' ','W','o','r','l','d'};
        String newString = String.copyValueOf(c);
        System.out.println(newString);
    }    
}