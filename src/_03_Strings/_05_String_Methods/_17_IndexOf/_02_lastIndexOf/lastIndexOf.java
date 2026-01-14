package _15_Strings._05_String_Methods._17_IndexOf._02_lastIndexOf;

public class lastIndexOf {
    public static void main(String[] args) {
        String name = "India is a great country, India is land of resources";
        //                                             ^   ^
        System.out.println(name.lastIndexOf("a"));  // It check a which index this char appeared for last time
        System.out.println(name.lastIndexOf("is")); // It check a which index this word appeared for last time
    }    
}
