package _02_Array.Problems.ArrayList._02_Sort_an_ArrayList;

// Sort the given ArrayList of String in Descending order

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("J");
        list.add("R");
        list.add("O");
        list.add("S");
        list.add("I");
        list.add("K");
        list.add("L");
        list.add("W");

        System.out.println("Original ArrayList : " + list);

        Collections.sort(list);     // It will sort the List in Ascending order

        System.out.println("Sorted ArrayList in Ascending order : " + list);

        Collections.sort(list, Collections.reverseOrder());     // It will sort the List in Descending order

        System.out.println("Sorted ArrayList in Descending order : " + list);
    }
}
