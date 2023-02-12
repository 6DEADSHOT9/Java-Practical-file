import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("file.txt");
            String str = "This is some data that will be written to the file.";
            byte[] b = str.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e);
        }
    }
}
