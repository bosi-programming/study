import java.util.*;

public class ComplexConditionals {
  public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);
    String input = reader.next();
    String sOne = "abc";
    String sTwo = "z";
    if(input.contains(sOne) || input.contains(sTwo)) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
