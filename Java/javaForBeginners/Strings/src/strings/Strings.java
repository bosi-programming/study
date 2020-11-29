package strings;

public class Strings {
  public static void main(String[] args) {
    CustomPrinter printer = new CustomPrinter("> > %s < <");

    String s1 = new String ("Strings are arrays of characters");
    String s2 = new String ("Strings are arrays of characters");

    printer.println("string1: " + s1);
    System.out.println("string1: " + s1.replace("characters", "chars"));
    System.out.println("string2: " + s2);
    System.out.println(s1.equals(s2));
  }
}
