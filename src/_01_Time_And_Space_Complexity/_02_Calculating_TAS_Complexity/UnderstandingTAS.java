package _01_Time_And_Space_Complexity._02_Calculating_TAS_Complexity;

public class UnderstandingTAS {     // Not considered
    public static void main(String[] args) {    // Not considered
        for (int i = 1; i <= 500; i++) {      // Considered (loop executes)
            System.out.println("Hello");    // Considered (loop executes)
        }
    }
}

/*
    Note : only Executable statements are responsible for calculating time complexity
*/