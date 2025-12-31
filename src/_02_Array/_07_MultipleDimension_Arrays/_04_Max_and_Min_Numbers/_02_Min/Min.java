package _02_Array._07_MultipleDimension_Arrays._04_Max_and_Min_Numbers._02_Min;

public class Min {
    public static void main(String[] args) {
        int ages[][] = {
                {43,65,76},
                {30,81,23},
                {14,77,92}
        };

        int gotMinNum = getMinDWL(ages);
        System.out.println(gotMinNum);
    }

    // Minimum Number through for loop
    public static int getMinFL(int minNum[][]){
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < minNum.length; i++) {
            for (int j = 0; j < minNum.length; j++) {
                if (minimum>minNum[i][j]) {
                    minimum = minNum[i][j];
                }
            }
        }
        return minimum;
    }

    // Minimum number through forEach loop
    public static int getMinFE(int minNum[][]){
        int minimum = Integer.MAX_VALUE;
        for (int[] rows : minNum) {
            for (int columns : rows) {
                if (minimum<columns) {
                    minimum = columns;
                }
            }
        }
        return minimum;
    }

    // Minimum number through while loop
    public static int getMinWL(int minNum[][]){
        int minimum = Integer.MAX_VALUE;
        int i = 0;
        while (i<minNum.length) {
            int j = 0;
            while (j<minNum.length) {
                if (minimum>minNum[i][j]) {
                    minimum = minNum[i][j];
                }
                j++;
            }
            i++;
        }
        return minimum;
    }

    // Minimum number through do-while loop
    public static int getMinDWL(int minNum[][]){
        int minimum = Integer.MAX_VALUE;
        int i = 0;
        do {
            int j = 0;
            do {
                if (minimum>minNum[i][j]) {
                    minimum = minNum[i][j];
                }
                j++;
            } while (j<minNum.length);
            i++;
        } while (i<minNum.length);
        return minimum;
    }
}

/*
    we can use this for constructor type of 2D array as well
    here , if number of columns are greater than number of rows then we have to add +n (means how many number columns more) in j loop
    and if number of rows are greater than number of columns then we have to state [i] in j loop after maxNum.
*/