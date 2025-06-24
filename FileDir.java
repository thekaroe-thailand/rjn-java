import java.io.File;

public class FileDir {
    public static void main(String[] args) {
        File file = new File("c://");
        String[] files = file.list();

        System.out.println("File in Directory: " + file.getAbsolutePath());

        for (String f : files) {
            if (f.endsWith(".java")) {
                System.out.println(f);
            }
        }
    }
}
