package _03_Strings._05_String_Methods._15_toCharArray;

// To convert StringClass into character array
// we have to save it in char as it will convert StringClass in to char type of array

public class toCharArray {
    public static void main(String[] args) {
        String name = "Shikhil";
        char charName[] = name.toCharArray();   // it will convert StringClass into character type of array
        for (char charArr : charName) {
            System.out.println(charArr);        // to print every character of an array
        }
    }    
}
