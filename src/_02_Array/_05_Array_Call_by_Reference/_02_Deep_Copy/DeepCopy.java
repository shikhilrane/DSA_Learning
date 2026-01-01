package _02_Array._05_Array_Call_by_Reference._02_Deep_Copy;

import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,6,9};
        System.out.println("Original Array");
        printArray(arr);

        // 1st way
        int[] copyArr = arr.clone();
        System.out.println("Copied Array");
        printArray(copyArr);

        copyArr[0] = 8;

        System.out.println("Original Array after updating copyArr");
        printArray(arr);    // We changed value of copyArr's element and value of arr at 0th element doesn't change

        System.out.println("Copied Array after updating copyArr");
        printArray(copyArr);

        // 2nd way (we have to pass array that we want to copy as well as till how much length)
        int[] copyArr1 = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array from .copyOf");
        printArray(copyArr1);

        // 3rd way (we have to pass array that we want to copy as well as till the length)
        int[] copyArr2 = Arrays.copyOf(arr, 2);
        System.out.println("Copied Array from .copyOf with length");
        printArray(copyArr2);

        // 4th way (we have to pass array that we want to copy as well as from index to to index)
        int[] copyArr3 = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("Copied Array from .copyOfRange");
        printArray(copyArr3);

    }

    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

/*
    Original array doesn't change, when we changed value of element of copyArr. Because,
*/