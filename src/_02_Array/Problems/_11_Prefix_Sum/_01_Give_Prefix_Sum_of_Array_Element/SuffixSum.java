package _02_Array.Problems._11_Prefix_Sum._01_Give_Prefix_Sum_of_Array_Element;

public class SuffixSum {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};

        int[] ints = makeSuffixSumArray(arr);

        for (int i : ints){
            System.out.println(i);
        }
    }

    public static int[] makeSuffixSumArray(int[] a){
        for (int i = a.length-2; i >= 0; i--) {
            a[i] = a[i] + a[i+1];
        }
        return a;
    }
}
