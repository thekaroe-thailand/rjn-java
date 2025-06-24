import java.io.File;

public class RemoveFile {
    public static void main(String[] args) {
        try {
            File file = new File("log.txt");

            if (file.exists()) {
                file.delete();
                System.out.println("file delete");
            } else {
                System.out.println("file does not exist");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
