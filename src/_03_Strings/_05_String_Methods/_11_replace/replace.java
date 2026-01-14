package _15_Strings._05_String_Methods._11_replace;

public class replace {
    public static void main(String[] args) {
        String name = "Shikhil Kishor Rane";
        System.out.println(name.replace("Sh", "N"));      // replaces specific letter or char with new word or char
        System.out.println(name.replaceAll("Shikhil Kishor", "Kishor Sitaram"));    // It replaces specific words with new words
    }    
}
