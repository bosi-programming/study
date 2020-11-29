import java.util.*;

public class IntroToLoops {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String input;
    String all = "";
    int i = 5;


    do {
      input = reader.nextLine();
      all += input;
      i--;
    } while(!input.equals("stop"));
      System.out.println(all);
  }
}
