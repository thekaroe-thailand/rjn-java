import java.io.FileWriter;
import java.io.IOException;

public class LogFile {
    public static void main(String[] args) {
        String logFileName = "log.txt";

        try {
            FileWriter fileWriter = new FileWriter(logFileName, true);

            for (int i = 0; i < 100; i++) {
                fileWriter.write("log file." + i + "\n");
            }
            fileWriter.close();
            System.out.println("Log file created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
