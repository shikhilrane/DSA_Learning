package _02_Array._09_ArrayList;

import java.util.*;

public class LearnArrayList {
    public static void main(String[] args) {
        // _16_ArrayList object
        ArrayList<String> list = new ArrayList<>();

        // ------------------------ Collection Interface Methods ------------------------

        System.out.println("=== Collection Interface Methods ===");

        // 1. add(E element) – Adds element to end of list
        list.add("A");
        list.add("B");
        list.add("1");

        // 2. addAll(Collection<? extends E> _02_Stream) – Adds all elements from collection to list
        list.addAll(Arrays.asList("C", "D"));

        // 3. remove(Object o) – Removes first occurrence of the specified element
        list.remove("B");
        System.out.println("After removing 'B': " + list);  // Output: [A, C, D]

        // remove(int index) – Removes element at specified index
        list.remove(1);
        System.out.println("After removing index 1: " + list);  // Output: [A, D]

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        // remove by index
        intList.remove(0);
        System.out.println("After removing by Index: " + intList);

        // remove by value
        intList.remove(Integer.valueOf(3));
        System.out.println("After removing by Value: " + intList);

        // 4. removeAll(Collection<?> _02_Stream) – Removes all matching elements from list
        list.removeAll(Arrays.asList("D"));
        System.out.println("List after removing all element that matches with D : " + list);

        // 5. retainAll(Collection<?> _02_Stream) – Keeps only elements present in specified collection
        list.retainAll(Arrays.asList("A", "C"));
        System.out.println("List after retaining all element that matches with A and C : " + list);

        // 6. contains(Object o) – Checks if element exists in list
        System.out.println("Contains 'A': " + list.contains("A"));

        // 7. containsAll(Collection<?> _02_Stream) – Checks if list contains all elements of the collection
        System.out.println("Contains all [A, C]: " + list.containsAll(Arrays.asList("A", "C")));

        // 8. isEmpty() – Returns true if list has no elements
        System.out.println("Is list empty? " + list.isEmpty());

        // 9. size() – Returns number of elements in list
        System.out.println("Size of list: " + list.size());

        // 10. iterator() – Returns iterator to traverse list
        System.out.print("Iterating: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 11. toArray() – Converts list to array of Objects
        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // 12. <T> T[] toArray(T[] a) – Converts list to typed array
        String[] strArr = list.toArray(new String[0]);
        System.out.println("Typed array: " + Arrays.toString(strArr));

        // 13. clear() – Removes all elements from list
        list.clear();
        System.out.println("Cleared list: " + list);

        // ------------------------ List Interface Methods ------------------------

        System.out.println("\n=== List Interface Methods ===");

        list.add("X");
        list.add("Y");
        list.add("Z");

        // 1. add(int index, E element) – Inserts element at specified index
        list.add(1, "A"); // X, A, Y, Z

        // 2. addAll(int index, Collection<? extends E> _02_Stream) – Inserts collection at specified index
        list.addAll(2, Arrays.asList("B", "C"));
        System.out.println(list);

        // 3. get(int index) – Returns element at specified index
        System.out.println("Element at index 3: " + list.get(3));

        // 4. set(int index, E element) – Replaces element at index with new value
        list.set(3, "M");
        System.out.println("List after setting M at index 3 " + list);

        // 5. remove(int index) – Removes element at specified index
        list.remove(2);
        System.out.println("List after removing element from index 2 " + list);

        // 6. indexOf(Object o) – Returns index of first occurrence
        System.out.println("Index of A: " + list.indexOf("A"));

        // 7. lastIndexOf(Object o) – Returns index of last occurrence
        list.add("X");
        System.out.println("Last index of X: " + list.lastIndexOf("X"));

        // 8. listIterator() – Returns ListIterator for forward/backward traversal
        ListIterator<String> li = list.listIterator();

        System.out.print("ListIterator next: ");
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();

        System.out.print("ListIterator previous: ");
        while (li.hasPrevious()) {
            System.out.print(li.previous() + " ");
        }
        System.out.println();

        // 9. listIterator(int index) – Returns ListIterator starting from given index
        System.out.print("ListIterator from index 2: ");
        ListIterator<String> liFrom2 = list.listIterator(2);
        while (liFrom2.hasNext()) {
            System.out.print(liFrom2.next() + " ");
        }
        System.out.println();

        // 10. subList(int fromIndex, int toIndex) – Returns a view of the list between indices
        List<String> sub = list.subList(1, 4);
        System.out.println("Sublist (1–4): " + sub);

        // 11. equals(Object o) – Compares list with another for equality
        ArrayList<String> other = new ArrayList<>(list);
        System.out.println("Equals another list? " + list.equals(other));

        // 12. hashCode() – Returns hash code of the list
        System.out.println("Hash code: " + list.hashCode());

        // Final output
        System.out.println("Final list: " + list);

        //------------------------ Deep understanding of _16_ArrayList ------------------------
        ArrayList<Integer> al = new ArrayList<>();
        // adding
        al.add(1);
        al.add(5);
        al.add(80);

        // getting by index
        System.out.println(al.get(2));
        // number of objects in arraylist
        System.out.println(al.size());

        // Iterating on arraylist using for loop
        for (int i = 0; i<al.size(); i++){
            System.out.println(al.get(i));
        }

        // Iterating on arraylist using forEach loop
        for(int x : al){
            System.out.println(x);
        }

        // Check if given object is present or not
        System.out.println(al.contains(5));

        // Removing object from particular index
        System.out.println(al.remove(1));

        // Adding an object to specified index
        al.add(1, 50);
        for(int x : al){
            System.out.println(x);
        }

        // Setting an object on particular index
        al.set(2, 90);
        for(int x : al){
            System.out.println(x);
        }

        // Internal working of _16_ArrayList (Look for notes of _16_ArrayList for better understanding)
        ArrayList<Integer> alSize1 = new ArrayList<>();     // Initial size if not defined by us then it will be 10 by default
        ArrayList<Integer> alSize2 = new ArrayList<>(100);  // This is how we can define capacity of _16_ArrayList, capacity = 100 but size = 0
        ArrayList<Integer> alSize3 = new ArrayList<>(50);
        for (int i = 0; i < 15; i++) {
            alSize3.add(i);
        }
        System.out.println(alSize3);
        alSize3.trimToSize();   // this will make capacity of alSize3 to 15

        // Type of creating _16_ArrayList
        // 1. By using _16_ArrayList<>(); (can add object in middle of the two existing objects using add(index, object) and can set value of existing object using set(index, object))
        List<Object> creatingAl1 = new ArrayList<>();
        creatingAl1.add(5);
        creatingAl1.add(25);
        creatingAl1.add(35);
        System.out.println(creatingAl1);
        creatingAl1.add(1,15);  // adding
        System.out.println(creatingAl1);
        creatingAl1.set(1,20);  // setting
        System.out.println(creatingAl1);
        // 2. By using Arrays.asList(); (can't add object in middle of the two existing objects but can set value of existing object using set(index, object) )
        List<Object> creatingAl2 = Arrays.asList(1,2,3);
        creatingAl2.set(1,20);  // setting
        System.out.println(creatingAl2);
        // 3. By using List.of(); (Neither can add object in middle of the two existing objects nor can set value of existing object )
        List<Object> creatingAl3 = List.of(4,5,6);

        // Adding in _16_ArrayList
        // adding collection
        ArrayList<Integer> addingInAl = new ArrayList<>(al);
        addingInAl.add(2);
        addingInAl.add(45);
        addingInAl.add(85);
        System.out.println(addingInAl);
        // adding List.of() in new _16_ArrayList<>()
        List<Integer> listof = List.of(11, 12, 13);
        addingInAl.addAll(listof);      // listof.addAll(addingInAl); (we can't do this because we know List.of() is unmodifiable)
        System.out.println(addingInAl);

        // Removing from _16_ArrayList
        // String
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.remove("apple"); // it will remove object by specifying itself
        System.out.println(fruits);
        // Integer
        ArrayList<Integer> removingFromAl = new ArrayList<>();
        removingFromAl.add(11);
        removingFromAl.add(22);
        removingFromAl.add(33);
        removingFromAl.add(44);
        // removingFromAl.remove(11);  // This remove element from given index
        removingFromAl.remove(Integer.valueOf(11)); //so will use wrapper class to remove value directly
        System.out.println(removingFromAl);

        // Converting to Array (List to Array)
        ArrayList<Integer> convertingLtoA = new ArrayList<>();
        convertingLtoA.add(1);
        convertingLtoA.add(2);
        convertingLtoA.add(3);
        Object[] ar = convertingLtoA.toArray();     // This will create array of objects
        Integer[] intArr = convertingLtoA.toArray(new Integer[0]); // This will create array of Integers, (because our array object is of Integer), (new array of size 0)

        // Sorting of an array
        // By using Collection (Method of Collection)
        ArrayList<Integer> sortingAlCollection = new ArrayList<>();
        sortingAlCollection.add(4);
        sortingAlCollection.add(3);
        sortingAlCollection.add(1);
        sortingAlCollection.add(5);
        sortingAlCollection.add(2);
        Collections.sort(sortingAlCollection);
        System.out.println(sortingAlCollection);
        // By using List (Method of List)
        ArrayList<Integer> sortingAlList = new ArrayList<>();
        sortingAlList.add(4);
        sortingAlList.add(3);
        sortingAlList.add(1);
        sortingAlList.add(5);
        sortingAlList.add(2);
        sortingAlList.sort(null);
        System.out.println(sortingAlList);  // It is using Comparator (we will learn comparator in further chapter)

        //------------------------ Comparator ------------------------
        // Sorting using Class
        List<Integer> list1 = Arrays.asList(5, 4, 7, 3, 2, 9, 8);
        System.out.println("list1 = Arrays.asList(5, 4, 7, 3, 2, 9, 8)");
        // 1. Sorting Integers in Ascending order
        list1.sort( null);
        System.out.println("Sorting Integers in Ascending order using Class : " + list1);
        // 2. Sorting Integers in Descending order
        list1.sort(new IntComparator());
        System.out.println("Sorting Integers in Descending order using Class : " + list1);

        System.out.println();

        // Sorting using Lambda Expression
        List<Integer> list2 = Arrays.asList(50, 40, 70, 30, 20, 90, 80);
        System.out.println("list2 = Arrays.asList(50, 40, 70, 30, 20, 90, 80)");
        // 1. Sorting Integers in Ascending order
        list2.sort((a,b) -> a-b);
        System.out.println("Sorting Integers in Ascending order using Lambda expression : " + list2);
        // 2. Sorting Integers in Descending order
        list2.sort((a,b) -> b-a);
        System.out.println("Sorting Integers in Descending order using Lambda expression: " + list2);

        System.out.println();

        List<String> list3 = Arrays.asList("cat", "pineapple", "dog", "apple", "banana");
        System.out.println("list3 = Arrays.asList(\"cat\", \"pineapple\", \"dog\", \"apple\", \"banana\")");
        // Sorting String from a to z order
        list3.sort(null);
        System.out.println("Sorting String from a to z order : " + list3);
        // Sorting String from z to a order
        list3.sort(new StringDescendingComparator());
        System.out.println("Sorting String from z to a order : " + list3);
        // Sorting String in Ascending of length
        list3.sort(new StringLengthComparatorAscLeng());
        System.out.println("Sorting String in Ascending of length : " + list3);
        // Sorting String in Descending of length
        list3.sort(new StringLengthComparatorDescLeng());
        System.out.println("Sorting String in Descending of length : " + list3);

        System.out.println();

        // Sorting using Lambda Expression
        List<String> list4 = Arrays.asList("Air", "Balloon", "Car", "Duck", "Elephant");
        System.out.println("list4 = Arrays.asList(\"Air\", \"Balloon\", \"Car\", \"Duck\", \"Elephant\")");
        // Sorting String from a to z order
        list4.sort((a,b) -> a.compareTo(b));
        System.out.println("Sorting String from a to z order using Lambda Expression : " + list4);
        // Sorting String from z to a order
        list4.sort((a,b) -> b.compareTo(a));
        System.out.println("Sorting String from z to a order using Lambda Expression : " + list4);
        // Sorting String in Ascending of length
        list4.sort((a,b) -> a.length()-b.length());
        System.out.println("Sorting String in Ascending of length using Lambda Expression : " + list4);
        // Sorting String in Descending of length
        list4.sort((a,b) -> b.length()-a.length());
        System.out.println("Sorting String in Descending of length using Lambda Expression : " + list4);

        System.out.println();

        // Sorting on Basis of name and gpa
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Adam", 3.9));

        System.out.println("List<Student> students = new _16_ArrayList<>();\n" +
                "        students.add(new Student(\"Charlie\", 3.5));\n" +
                "        students.add(new Student(\"Bob\", 3.7));\n" +
                "        students.add(new Student(\"Alice\", 3.5));\n" +
                "        students.add(new Student(\"Adam\", 3.9));");

        // 1. Sorting in Ascending order of marks
        students.sort((a,b) -> {
            if ((b.getGpa()-a.getGpa())>0){
                return 1;   // Return 1 means b is greater, from previous sorting knowledge
            } else if ((b.getGpa()-a.getGpa())<0) {
                return -1;  // Return -1 means a is greater, from previous sorting knowledge
            } else {
                return 0;
            }
        });

        for(Student std : students){
            System.out.println("Sorting in Ascending order of marks : " + std.getName() + " " + std.getGpa());
        }

        // 2. Sorting in Descending order of marks
        students.sort((a,b) -> {
            if ((a.getGpa()-b.getGpa())>0){
                return 1;   // Return 1 means b is greater
            } else if ((a.getGpa()-b.getGpa())<0) {
                return -1;  // Return -1 means a is greater
            } else {
                return 0;
            }
        });

        for(Student std : students){
            System.out.println("Sorting in Descending order of marks : " + std.getName() + " " + std.getGpa());
        }

        // 3. Sorting name letter from a to z
        students.sort((a,b) -> {
            if ((a.getName().compareTo(b.getName()))>0){
                return 1;   // Return 1 means b is greater
            } else if ((a.getName().compareTo(b.getName()))<0) {
                return -1;  // Return -1 means a is greater
            } else {
                return 0;
            }
        });

        for(Student std : students){
            System.out.println("Sorting name letter from a to z : " + std.getName() + " " + std.getGpa());
        }

        // 4. Sorting name letter from z to a
        students.sort((a,b) -> {
            if ((b.getName().compareTo(a.getName()))>0){
                return 1;   // Return 1 means b is greater from previous sorting
            } else if ((b.getName().compareTo(a.getName()))<0) {
                return -1;  // Return -1 means a is greater
            } else {
                return 0;
            }
        });

        for(Student std : students){
            System.out.println("Sorting name letter from z to a : " + std.getName() + " " + std.getGpa());
        }
    }
}

// Sorting logic ->
// Ascending - o1 is first element and o2 is second element (o1-o2), if substraction is positive then 2nd number first and if substraction is negative then 1st number first and if substraction is equal then both numbers are at same position
// Descending - o2 is second element and o1 is first element (o2-o1), if substraction is positive then 2nd number first and if substraction is negative then 1st number first and if substraction is equal then both numbers are at same position
// That is, if substraction = positive then o2 will be preferred and if negative then o1 will be preferred, in any situation

// Integers
class IntComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
//        return o1-o2;       // This will return numbers in ascending order
        return o2-o1;       // This will return numbers in descending order
    }
}


// String
class StringDescendingComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);  // Reverse of natural order
    }
}


class StringLengthComparatorAscLeng implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}

class StringLengthComparatorDescLeng implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.length()-o1.length();
    }
}

// Class for sorting on field of class
class Student{
    private final String name;
    private final double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}