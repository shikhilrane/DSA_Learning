package _02_Array._05_Array_Call_by_Reference._01_Shallow_Copy;

public class ShallowCopy {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,6,9};
        System.out.println("Original Array");
        printArray(arr);

        int[] copyArr = arr;
        System.out.println("Copied Array");
        printArray(copyArr);

        copyArr[0] = 8;

        System.out.println("Original Array after updating copyArr");
        printArray(arr);    // We changed value of copyArr's element but value of element at 0th position of arr will also get changed here

        System.out.println("Copied Array after updating copyArr");
        printArray(copyArr);
    }

    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

/*
    Original array changed, when we changed value of element of copyArr. Because,
        When copy the elements of original array to new array, it actually doesn't copy the elements instead it just refer the address of original array
        so when we update the value of copyArr, then value in original array will also get changed
*/