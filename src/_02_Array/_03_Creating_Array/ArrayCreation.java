package _02_Array._03_Creating_Array;

// Creating an Array
// arrays are static type of data structure means we cant add more data during execution, means if we made array of length 5 and add want to add add 6th value then it is not posible, for that case we have to create new array of length 6 and copy data ka last array of length 5 and add 6th number of data

public class ArrayCreation {
    public static void main(String[] args) {
        // 1st way to create an array
        int nums[];                         // Declaration              another way to write this, int[]nums;
        nums = new int[5];                  // Allocation in memory
        nums[0] = 23;                       // Assigning values
        nums[1] = 32;
        nums[2] = 45;
        nums[3] = 51;
        nums[2] = 78;                       // updating value of an array
        System.out.println(nums[2]);        // it will show the stored num on index 2
        System.out.println(nums[4]);        // it will show 0 because if we dont assign value to specific index then it will be 0 for int automati
        // System.out.println(nums[5]);     // array length is 5 but we asking to show value at index 5 which is actually at 6th position so error
        System.out.println(nums.length);    // it will show the length of an array

        // 2nd way to create an array
        int myArr[] = new int[5];           // this way we can directly allocate memory during creation of an array
        myArr[0] = 34;
        myArr[1] = 127;
        myArr[2] = 126;
        myArr[3] = 125;
        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);
        System.out.println(myArr.length);

        // 3rd way to create an array
        int marks[] = {43,65,76,43,76,89};  // this way we can directly add values to an array
        System.out.println(marks[3]);
        System.out.println(marks.length);

        // StringClass as an array
        String name[] = {"Ram", "Sita", "Laxman"};
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        // Boolean as an array
        boolean decision[] = {true, false, true};
        System.out.println(decision[0]);
        System.out.println(decision[1]);
        System.out.println(decision[2]);

        boolean b[] = new boolean[3];
        b[0] = false;
        b[1] = true;
        System.out.println("b[2] is " + b[2]);  // empty index of boolean is false because empty means 0 and zero is false in binary
        System.out.println(b[1]);
    }
}
