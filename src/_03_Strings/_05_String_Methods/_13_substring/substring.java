package _03_Strings._05_String_Methods._13_substring;

public class substring {
    public static void main(String[] args) {
        String name = "India is the great country";
        String updateString = name.substring(2,11);     // It gives specific length, first index is inclusive aecond index is exclusive
        String updatedStringAgain = name.substring(3);  // It gives length from specified index till end
        System.out.println(updateString);
        System.out.println(updatedStringAgain);
    }    
}
