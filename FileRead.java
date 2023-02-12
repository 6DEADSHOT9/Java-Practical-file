import java.io.*;

public class FileRead {
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("test.txt");
      int content;
      while ((content = fis.read()) != -1) {
        // convert int to char
        System.out.print((char) content);
      }
      fis.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
    } catch (IOException e) {
      System.out.println("Error reading file.");
    }
  }
}
