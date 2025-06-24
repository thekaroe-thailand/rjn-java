import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
//import java.io.*;

public class RenameFile {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if (file.exists()) {
            file.renameTo(new File("test2.txt"));
            System.out.println("file renamed");
        } else {
            try {
                file.createNewFile();
                FileWriter writer = new FileWriter(file);
                writer.write("Hello World");
                writer.close();

                file.renameTo(new File("test2.txt"));
                System.out.println("File renamed");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
