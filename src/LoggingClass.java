import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoggingClass {

    public static void writeUsingFileWriter(String data) {
        File file = new File("FileLog.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
