package _03_Strings._03_Comparing_two_String._01_Comparing_reference_of_String;

public class ComparingReference {
    public static void main(String[] args) {
        String name = "Shikhil";
        String fname = "Shikhil";
        String firstName = " Shikh";
        String fullName = new String("Shikhil Kishor Rane");
        String myFullName = new String("Shikhil Kishor Rane");

        // Comparing both StringClass literals
        if (name==fname) {                                                      // 1st case
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are different");
        };

        if (name==firstName) {                                                  // 2nd case
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are different");
        };

        // Comparing StringClass literal with constructor type of StringClass
        if (name==fullName) {                                                   // 3rd case
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are different");
        };

        // Comparing both constructor StringClass
        if (fullName==myFullName) {                                             // 4th case
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are different");
        };
    }
}

/*
    Notes :-

    StringClass name = "Shikhil";
    StringClass fname = "Shikhil";
    StringClass firstName = " Shikh";
    StringClass fullName = new StringClass("Shikhil Kishor Rane");
    StringClass myFullName = new StringClass("Shikhil Kishor Rane");
        left side   =    right side
            ^                 ^
            ||                ||
        reference           value

    == is compare reference of the StringClass
    In 1st case : reference of both Strings are same because in StringClass constant pool both are refered at same memory
    In 2nd case : reference of the both literals are different in StringClass constant pool thats why it is also different.
    In 3nd case : reference of literal and object are different i.e. literal are stored in StringClass constant pool and objects are stored
                  in directly in heap memory
    In 4rd case : reference of both object refer to different memory location in heap memory

    In primitive data types, when we use == it checks the value, if values are same it shows true else false
    In non-primitive data types, when we use == it checks the references, if reference are same it shows true else false

    image attached check it
 */