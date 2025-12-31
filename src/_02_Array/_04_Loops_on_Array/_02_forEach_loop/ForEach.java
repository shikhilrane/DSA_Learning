package _02_Array._04_Loops_on_Array._02_forEach_loop;

// If we want to iterate over all the elements of an array then we use forEach loop.
// data type for forEach loop must be same of data type of array.

public class ForEach {
    public static void main(String[] args) {
        // forEach loop on int
        int myMarks[] = {65,67,69,68,66};                   // int type of array

        System.out.println("All the elements of array");
        for (int i : myMarks) {                             // it will print all the elements of an array
            System.out.println(i);
        }

        System.out.println("Loop on Constructor type of array");
        int marks[] = new int[3];
        marks[0] = 65;
        marks[1] = 67;
        marks[2] = 68;
        int ages[] = new int[3];
        ages[0] = 22;
        ages[1] = 31;
        ages[2] = 19;

        for (int i : ages) {
            System.out.println(i);
        }

        System.out.println("Addition of elements of an array");
        int sum = 0;
        for (int i : myMarks) {                             // it will add all the elements of an array
            sum = sum + i;
        }
        System.out.println(sum);

        // forEach loop on StringClass
        String myName[] = {"Shikhil", "Kishor", "Rane"};    // StringClass type of array

        System.out.println("All the elements of array");
        for (String names : myName) {                       // it will print all the elements of an array
            System.out.println(names);
        }

        System.out.println("StringClass Concatenation");
        String strConcat = "";
        for (String string : myName) {
            strConcat = strConcat + " " + string;
        }
        System.out.println(strConcat);
    }
}