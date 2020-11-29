public class Switcher {
  public static void main (String[] args) {
    int x = 7;

    switch(x) {
      case 1: case 5: case 7:
        System.out.println("red");
        break;
      case 2:
        System.out.println("blue");
        break;
      case 3:
        System.out.println("green");
        break;
      default:
        System.out.println("none");
    }
  }
}
