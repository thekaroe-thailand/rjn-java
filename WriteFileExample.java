import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, World");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
