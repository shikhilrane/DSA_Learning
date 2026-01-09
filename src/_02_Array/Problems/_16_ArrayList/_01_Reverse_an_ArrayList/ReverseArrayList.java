package _02_Array.Problems._16_ArrayList._01_Reverse_an_ArrayList;

// Reverse the _16_ArrayList

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(2);
        list.add(6);

        System.out.println("Original _16_ArrayList : " + list);

        reverse(list);

        System.out.println("Original _16_ArrayList : " + list);
    }

    public static void reverse(ArrayList<Integer> list){
        int i = 0;                          // Pointer starting from the first element
        int j = list.size() - 1;            // Pointer starting from the last element

        while (i < j){                      // Keep swapping until both pointers meet
            Integer temp = list.get(i);     // Store left element temporarily
            list.set(i, list.get(j));       // Put right element at left position
            list.set(j, temp);              // Put stored left element at right position
            i++;                            // Move left pointer forward
            j--;                            // Move right pointer backward
        }
    }



}
