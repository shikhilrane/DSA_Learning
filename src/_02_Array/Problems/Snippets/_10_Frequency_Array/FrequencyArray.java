package _02_Array.Problems.Snippets._10_Frequency_Array;

public class FrequencyArray {
    public static int[] makeFrequencyArray(int[] a){
        int[] freq = new int[100001];           // Created an array and its capacity is 10 raise to power 5 (Given in the question)
        for (int i = 0; i < a.length; i++) {    // keep putting traverse an array
            freq[a[i]]++;                       // Increment frequency of element a[i]. (if in array, 4 comes 2 times then it will count as 2)
        }
        return freq;
    }
}
