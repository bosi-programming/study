package objectOriented;
import java.util.*;
public class GettingObjectOriented {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Person john = new Person( "John", "Doe", new GregorianCalendar(1988, 1, 5) );
        System.out.println("Hello, my name is " + john.fullName() + ". I am " + john.age(new GregorianCalendar()) + " years old.");
    }
}
