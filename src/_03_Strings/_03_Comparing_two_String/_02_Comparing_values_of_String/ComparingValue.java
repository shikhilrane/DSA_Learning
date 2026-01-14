package _03_Strings._03_Comparing_two_String._02_Comparing_values_of_String;

// As we saw java compares refernce of non-primitive data types but if we want to compare values then we will use this method
// It does not care about reference of that value
// case sensitive :- firstString.equals(secondString)
// case insensitive :- firstString.equalsIgnoreCase(secondString)

public class ComparingValue {
    public static void main(String[] args) {
        String name = "Shikhil";
        String fName = "SHIKHIL";
        String firstName = new String("Shikhil");

        // It checks if values are same, it does not care about reference of that value
        if (name.equals(firstName)) {
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        };

        if (name.equals(fName)) {
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal"); // here java is case sensitive thats why it showed Both are not equal.
        };

        // It checks if values are same, it does not care about reference of that value also does not care of case sensitivity
        if(name.equalsIgnoreCase(fName)){
            System.out.println("Both are equal"); // here java is case sensitive but still it ignore case sensitivity.
        }else{
            System.out.println("Both are not equal");
        };
    }
}
