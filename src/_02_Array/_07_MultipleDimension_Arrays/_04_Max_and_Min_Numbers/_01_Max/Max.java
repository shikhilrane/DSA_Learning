package _02_Array._07_MultipleDimension_Arrays._04_Max_and_Min_Numbers._01_Max;

public class Max {
    public static void main(String[] args) {
        int ages[][] = {
                {43,65,76},
                {30,81,23},
                {14,77,92}
        };

        int gotMaxNum = getMaxFL(ages);
        System.out.println(gotMaxNum);
    }

    // Max Number through for loop
    public static int getMaxFL(int maxNum[][]){
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < maxNum.length; i++) {
            for (int j = 0; j < maxNum.length; j++) {
                if (maximum<maxNum[i][j]) {
                    maximum = maxNum[i][j];
                }
            }
        }
        return maximum;
    }

    // Max Number through forEach loop
    public static int getMaxFE(int maxNum[][]){
        int maximum = Integer.MIN_VALUE;
        for (int[] rows : maxNum) {
            for (int columns : rows) {
                if (maximum<columns) {
                    maximum = columns;
                }
            }
        }
        return maximum;
    }

    // Max Number through while loop
    public static int getMaxWL(int maxNum[][]){
        int maximum = Integer.MIN_VALUE;
        int i = 0;
        while (i<maxNum.length) {
            int j = 0;
            while (j<maxNum.length) {
                if (maximum<maxNum[i][j]) {
                    maximum = maxNum[i][j];
                }
                j++;
            }
            i++;
        }
        return maximum;
    }

    // Max Number through do-while loop
    public static int getMaxDWL(int maxNum[][]){
        int maximum = Integer.MIN_VALUE;
        int i = 0;
        do {
            int j = 0;
            do {
                if (maximum<maxNum[i][j]) {
                    maximum = maxNum[i][j];
                }
                j++;
            } while (j<maxNum.length);
            i++;
        } while (i<maxNum.length);
        return maximum;
    }
}

/*
    we can use this for constructor type of 2D array as well
    here , if number of columns are greater than number of rows then we have to add +n (means how many number columns more) in j loop
    and if number of rows are greater than number of columns then we have to state [i] in j loop after maxNum.
*/