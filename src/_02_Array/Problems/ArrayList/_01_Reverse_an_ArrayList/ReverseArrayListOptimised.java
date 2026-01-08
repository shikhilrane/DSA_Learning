package _02_Array.Problems.ArrayList._01_Reverse_an_ArrayList;

// Reverse the ArrayList with method from Collections

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayListOptimised {
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

        System.out.println("Original ArrayList : " + list);

        Collections.reverse(list);

        System.out.println("Original ArrayList : " + list);
    }
}
