package _03_Strings._05_String_Methods._23_getBytes;

public class byteCode {
    public static void main(String[] args) {
        String name = "Shikhil";
        byte[] by = name.getBytes();
        System.out.println(java.util.Arrays.toString(by));
    }    
}