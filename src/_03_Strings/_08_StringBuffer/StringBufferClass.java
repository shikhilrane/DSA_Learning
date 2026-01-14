package _03_Strings._08_StringBuffer;

public class StringBufferClass {
    public static void main(String[] args) {
        // StringBuffer
        StringBuffer sb = new StringBuffer("Hello ");

        // 1. Append
        sb.append("World");                // The World will be added to last
        System.out.println(sb);

        // 2. Insert
        sb.insert(5, " Java");  // " Java" will be added in sb from index 5
        System.out.println(sb);

        // 3. Replace
        sb.replace(5,10," JavaScript");
        System.out.println(sb);

        // 4. Delete
        sb.delete(5,16);
        System.out.println(sb);

        // 5. Reverse
        sb.reverse();
        System.out.println(sb);

        // 6. CharAt
        System.out.println(sb.charAt(4));

        // 7. Length
        System.out.println(sb.length());

        // 8. SubString
        System.out.println(sb.substring(1,4));

        // 9. IndexOf
        System.out.println(sb.indexOf("e"));

        // 10. IndexOf with fromIndex
        System.out.println(sb.indexOf("l",8));

        // 11. Delete character at
        System.out.println(sb.deleteCharAt(8));

        // 12. Method Chaining
        sb.append("3").reverse().replace(2,4, "hii");
        System.out.println(sb);

        // 13. Converting to Immutable string
        String str = sb.toString();
        System.out.println(str);
    }
}

/*
    1. StringBuffer is mutable
    2. It gets stored in Heap, not in String Pool Area
    3. StringBuffer provides method chaining
    4. Slower than StringBuilder because there is an overhead of synchronization for thread safety, but faster than String
    5. StringBuilder is ThreadSafe
    6. If we want thread-safe String that change further, then we will use StringBuffer
*/