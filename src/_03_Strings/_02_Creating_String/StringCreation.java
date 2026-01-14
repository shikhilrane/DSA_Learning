package _03_Strings._02_Creating_String;

public class StringCreation {
    public static void main(String[] args) {
        // 1st way (value of this type of StringClass stored in 'StringClass pool area' in heap memory)
        String name = "Shikhil";
        String fname = "Shikhil"; // it is stored in StringClass pool area as value of name and fname is same
        System.out.println(name);
        System.out.println(name.length());  // It shows the length of the StringClass.


        // 2nd way  (value of this type of StringClass stored directly in heap memory)
        String fullName = new String("Shikhil Kishor Rane");
        System.out.println(fullName);

        System.out.println("Shikhil"); // it also refered to StringClass pool area as value of StringClass name & this has same value, this way actually doesn't consume memory, it execute and get removed from the memory
    }
}
