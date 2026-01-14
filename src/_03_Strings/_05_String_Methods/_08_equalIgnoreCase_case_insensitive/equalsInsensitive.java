package _03_Strings._05_String_Methods._08_equalIgnoreCase_case_insensitive;

public class equalsInsensitive {
    public static void main(String[] args) {
        String fName = "Shikhil";
        String lName = "SHIKHIL";
        System.out.println(fName.equalsIgnoreCase(lName));    // It checks if values of StringClass are equal or not (it is case insensitive) o/p => true/false
    }    
}