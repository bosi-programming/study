import java.util.*;

public class Maps {
  public static void main(String[] args) {
    String[] allNames =
      //<editor-fold desc="raw names data">
      {"Jane", "Addams",
      "Muhammad", "Ali",
      "Stephen", "Ambrose", 
      "Louis", "Armstrong", 
      "Joan", "Baez", 
      "Josephine", "Baker", 
      "Eleanor", "Roosevelt", 
      "Frank", "Sinatra"
      };
    //</editor-fold>
    String[] firstNames = new String[allNames.length/2];
    String[] lastNames = new String[allNames.length/2];
    for(int i = 0; i < allNames.length; i++) {
      if(i % 2 == 0){
        firstNames[i/2] = allNames[i];
      } else {
        lastNames[i/2] = allNames[i];
      }
    }
    Map<String, String> famousPeople = new HashMap<>();

    for(int i = 0; i < lastNames.length; i++) {
      famousPeople.put(lastNames[i], firstNames[i]);
    }

    System.out.println(famousPeople.get("Ali"));
  }
}
