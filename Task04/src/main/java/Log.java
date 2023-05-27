import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Log {
    static {
        try (FileInputStream in = new FileInputStream("log.config")) {
            LogManager.getLogManager().readConfiguration(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Logger log(String className) {
        return Logger.getLogger(className);
    }
}
