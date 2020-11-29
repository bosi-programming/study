package serialization;
import java.io.*;

public class DeSerialize {
    public static void main(String[] args) {
        Car c = null;

        try {
            FileInputStream inFile = new FileInputStream("serialized.dat");
            ObjectInputStream in = new ObjectInputStream(inFile);
            c = (Car)in.readObject();
            in.close();
            inFile.close();
        } catch(IOException e) {
            System.err.println("Error");
        } catch(ClassNotFoundException e) {
            System.err.println("Error");
        }
    System.out.println(c.toString());
    }
}

