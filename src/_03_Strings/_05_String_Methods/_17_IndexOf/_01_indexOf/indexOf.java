package _03_Strings._05_String_Methods._17_IndexOf._01_indexOf;

public class indexOf {
    public static void main(String[] args) {
        String name = "India is a great country, India is land of resources";
        System.out.println(name.indexOf("a"));  // It check at which index this char appeared for first time
        System.out.println(name.indexOf("a", 5));  // It check at which index this char appeared for more number of times
        System.out.println(name.indexOf("is")); // It check at which index this word appeared for first time
        System.out.println(name.indexOf("is", 7)); // It check at which index this word appeared for more number of times
    }
}
