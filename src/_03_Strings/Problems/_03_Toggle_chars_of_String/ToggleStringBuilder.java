package _03_Strings.Problems._03_Toggle_chars_of_String;

// Given a string, the task is to toggle all the characters of the string using StringBuilder class.

public class ToggleStringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("PhysICS @ WaLlAh");
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);                 // Changed a current character to Ascii value

            // Check if character is an alphabet
            if (ascii >= 65 && ascii <= 90) {          // If that character is between 65 and 90 i.e. Uppercase, then make it Lowercase
                ascii = ascii + 32;
            }
            else if (ascii >= 97 && ascii <= 122) {    // If that character is between 97 and 122 i.e. Lowercase, then make it Uppercase
                ascii = ascii - 32;
            }
            else {                                     // If any character or space or any other symbol occur, skip that
                continue;  // skip space, @, etc.
            }

            str.setCharAt(i, (char) ascii);            // Set the value at the particular index
        }

        System.out.println(str);
    }
}
