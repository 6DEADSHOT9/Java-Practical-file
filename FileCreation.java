import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        String data = "This is some sample text data.";
        byte[] dataToWrite = data.getBytes();

        try {
            FileOutputStream fos = new FileOutputStream("sample.txt");
            fos.write(dataToWrite);
            fos.close();
            System.out.println("File created and data written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file and writing the data.");
            e.printStackTrace();
        }
    }
}
