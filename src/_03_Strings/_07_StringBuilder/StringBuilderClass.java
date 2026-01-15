package _03_Strings._07_StringBuilder;

public class StringBuilderClass {
    public static void main(String[] args) {
        // StringBuilder
        StringBuilder sb = new StringBuilder("Hello ");

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
    1. StringBuilder is mutable
    2. It gets stored in Heap, not in String Pool Area
    3. StringBuilder provides method chaining
    4. Faster than String and StringBuffer because there is not an overhead of synchronization for thread safety in StringBuffer.
    5. But StringBuilder is not ThreadSafe
    6. If we want faster Strings that change further, then we will use StringBuilder

    so we will see StringBuffer
*/

/*
    1. StringBuilder is mutable (can change its content).
    2. Internally it uses a resizable char[] array.
    3. Default capacity = 16 characters.
    4. If created with a String:
          capacity = 16 + string.length().
    5. It maintains a count variable to track current length.
    6. On append/insert, it first checks capacity.
    7. If capacity is not enough, it grows as:
          newCapacity = (oldCapacity * 2) + 2.
    8. Old data is copied into the new bigger array.
    9. append(), insert(), delete() modify the same object (no new object created).
    10. Faster than String because no repeated object creation.
    11. Not thread-safe (no synchronization).
    12. toString() creates a new immutable String object.
*/
