import java.io.File;

public class FileExists {
    public static void main(String[] args) {
        File file = new File("c://");

        if (file.exists()) {
            System.out.println("file exists");
            System.out.println(file.getAbsolutePath());
        } else {
            System.out.println("file does not exists");
        }
    }
}
