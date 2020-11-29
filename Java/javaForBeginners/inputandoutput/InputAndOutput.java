import java.io.*;

public class InputAndOutput {
  public static void main (String[] args) throws IOException {
    File outFile = new File("OutputFile.txt");
    File inFile = new File("InputFile.txt");

    FileWriter out = new FileWriter(outFile);
    FileReader in = new FileReader(inFile);

    out.write(in.read());
    out.close();
    in.close();
  }
}
