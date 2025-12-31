package _02_Array._07_MultipleDimension_Arrays._02_Ways_to_create_2D_Arrays;

public class CreatingMultiDimArray {
    public static void main(String[] args) {

        int numbers[][];
        numbers = new int[3][3];        // new int [row] [column]
        numbers[0][0] = 15;
        System.out.println(numbers[0][0]);

        // this is how we can create constructor type of 2D array
        int nums[][] = new int[3][3];       // It shows constructor array when we use [][] while creating it & has 3 rows and 3 columns
        nums[0][0] = 1;                     // this is how we can add elements in 2D array
        nums[0][1] = 2;
        nums[0][2] = 3;
        nums[0][0] = 4;
        nums[0][1] = 5;
        nums[0][2] = 6;
        nums[0][0] = 7;
        nums[0][1] = 8;
        nums[0][2] = 9;

        // this is how we can create direct array
        int ages[][] = {                        // It shows construcor array when we use [][] while creating it
                {43,65,76},                     // this is 1st row
                {30,81,23},                     // this is 2nd row
                {14,77,92}                      // this is 3rd row
        };
        System.out.println(ages.length);
    }
}

/*
    Note :-
        we can iterate over 2D arrays as well using for, while and forEach loops
 */