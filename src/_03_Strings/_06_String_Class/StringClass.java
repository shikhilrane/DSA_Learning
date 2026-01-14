package _03_Strings._06_String_Class;

public class StringClass {
    public static void main(String[] args) {
        // 1
        String str1 = "Hello";
        String str2 = str1.concat("world");
        System.out.println(str1);   // Won't change because strings are immutable (immutable = It won't be changed further)
        System.out.println(str2);   // Will change because it will create a new string

        // 2
        String result = "";
        for (int i = 0; i < 100 ; i++) {
            result = result + " Hello ";
        }
//        System.out.println(result);
        // 1. In above case, new String will be created in memory for each and every iteration, which is not a memory efficient, Which can lead to poor performance
        // 2. So to resolve this issue StringBuilder and StringBuffer classes comes into the picture which are mutable(can be changed)

    }
}

// As we know, this String is immutable (like it will get stored in String Pool) even if we create string with new keyword.
// If we want small and fixed string that doesn't change further, then we will use String