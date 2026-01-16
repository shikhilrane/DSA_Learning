package _03_Strings.Problems._01_Print_from_Index;

public class PrintFromI {
    public static void main(String[] args) {
        String string = "Physics";

        // 1. Loop to print from specific index to its full length
        for (int i = 2; i < 4; i++) {
            System.out.println(string.substring(i));
        }

        // 2. Loop on whole String
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.substring(i));
        }
    }
}