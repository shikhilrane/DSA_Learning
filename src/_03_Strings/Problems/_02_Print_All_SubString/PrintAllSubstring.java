package _03_Strings.Problems._02_Print_All_SubString;

public class PrintAllSubstring {
    public static void main(String[] args) {
        String str = "Physics";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.print(str.substring(i,j) + " ");
            }
            System.out.println();
        }
    }
}
