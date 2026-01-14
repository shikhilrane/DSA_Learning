package _03_Strings._05_String_Methods._14_split;
// It spilts the words or character on basis of our input
// It returns array

public class split {
    public static void main(String[] args) {
        String country = "India is great country";
        
        // split string on basis of " "(space)
        String splitCountry[] = country.split(" ");     // It will convert make an array on basis of our input
        for (String arrString : splitCountry) {
            System.out.println(arrString);              // It will print words we splitted into array
        }

        System.out.println();

        // split words on basis of any character or word
        String charSplit[] = country.split("a");
        for (int i = 0; i < charSplit.length; i++) {
            System.out.println(charSplit[i]);
        }
    }    
}