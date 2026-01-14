package _03_Strings._05_String_Methods._16_isEmpty_and_isBlank;

// It tells StringClass empty or not

public class empty {
    public static void main(String[] args) {
        String name = " ";
        System.out.println(name.isEmpty());     // It returns true because StringClass containing spaces
        System.out.println(name.isBlank());     // It returns false because it reckons " " as empty
    }    
}