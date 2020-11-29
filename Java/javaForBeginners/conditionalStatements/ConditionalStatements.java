import java.util.*;

public class ConditionalStatements {
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    System.out.println("Input text now: ");
    int input = reader.nextInt();
    System.out.println(input);

    if(input > 10) {
      System.out.println("More");
    } else {
      System.out.println("Less");
    }
  }
}
