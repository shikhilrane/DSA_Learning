package _03_Strings.Problems._03_Toggle_chars_of_String;

// Given a string, the task is to toggle all the characters of the string using String.

public class ToggleString {
    public static void main(String[] args) {
        String str = "PhysICS @ WaLlAh";
        System.out.println(str);

        char[] arr = str.toCharArray();                // Converted String to character array

        for (int i = 0; i < arr.length; i++) {
            int ascii = arr[i];                        // Changed a current character to Ascii value

            if (ascii >= 65 && ascii <= 90) {          // If that character is between 65 and 90 i.e. Uppercase, then make it Lowercase
                ascii = ascii + 32;
            }
            else if (ascii >= 97 && ascii <= 122) {    // If that character is between 97 and 122 i.e. Lowercase, then make it Uppercase
                ascii = ascii - 32;
            }
            else {                                     // If any character or space or any other symbol occur, skip that
                continue;
            }

            arr[i] = (char) ascii;                     // Assign the value to the particular element
        }

        // Converting character array to String
        String toggled = new String(arr);
        System.out.println(toggled);
    }
}
