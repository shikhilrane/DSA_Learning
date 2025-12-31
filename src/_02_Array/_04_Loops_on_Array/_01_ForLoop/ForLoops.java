package _02_Array._04_Loops_on_Array._01_ForLoop;

// For loop on Array
// This way we can print elements or perform operations on elements of array

public class ForLoops {
    public static void main(String[] args) {
        int myArr[] = {65,76,32,87,54};                     // int type of array

        // loop on int
        System.out.println("single element");
        for (int i = 0; i < myArr.length; i++) {            // accessing single element of an array
            System.out.println(myArr[2]);
        }

        System.out.println("all the element");
        for (int i = 0; i < myArr.length; i++) {            // accessing all elements of an array
            System.out.println(myArr[i]);
        }

        System.out.println("partial element");
        for (int i = 0; i < (myArr.length-2); i++) {        // accessing partial elements of an array
            System.out.println(myArr[i]);
        }

        System.out.println("Addition of elements");
        int addition = 0;
        for (int i = 0; i < myArr.length; i++) {            // performing operation on array
            addition = addition + myArr[i];
        }
        System.out.println("Addition is " + addition);

        System.out.println("loop on constructor type of array");
        int marks[] = new int[3];
        marks[0] = 65;
        marks[1] = 67;
        marks[2] = 68;
        int ages[] = new int[3];
        ages[0] = 22;
        ages[1] = 31;
        ages[2] = 19;
        for (int i = 0; i < 2; i++) {                       // loop on constructor type of array
            System.out.println(marks[i]);
        }

        System.out.println("Substraction of elements");
        int substraction = 0;
        for (int i = 2; i < (myArr.length-1); i++) {        // performing operation on specific range of array
            substraction = substraction - myArr[i];
        }
        System.out.println("Substraction is " + substraction);

        // for loop on Strings
        String myStr[] = {"Java", "Python", "JS", "PHP"};   // StringClass type of array

        System.out.println("single element");
        for (int i = 0; i < myStr.length; i++) {            // accessing single element of an array
            System.out.println(myStr[2]);
        }

        System.out.println("all the element");
        for (int i = 0; i < myStr.length; i++) {            // accessing all elements of an array
            System.out.println(myStr[i]);
        }

        System.out.println("partial elements");
        for (int i = 0; i < (myStr.length-2); i++) {        // accessing partial elements of an array
            System.out.println(myStr[i]);
        }

        System.out.println("Specific elements");
        for (int i = 1; i < (myStr.length-1); i++) {        // performing operation on specific range of array
            System.out.println(myStr[i]);
        }

        System.out.println("StringClass Concat");
        String concat = "";
        for (int i = 0; i < myStr.length; i++) {            // StringClass concat
            concat = concat + " " +  myStr[i];
        }
        System.out.println(concat);
    }
}
