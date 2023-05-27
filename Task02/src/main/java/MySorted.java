import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySorted {
    private static Logger logger = Log.log(MySorted.class.getName());
    public int[] sortedArray(int[] randomArray) {
        logger.log(Level.INFO, Arrays.toString(randomArray));
        int n = randomArray.length;
        int value;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (randomArray[j] > randomArray[j + 1]) {
                    value = randomArray[j];
                    randomArray[j] = randomArray[j + 1];
                    randomArray[j + 1] = value;
                }
                logger.log(Level.INFO, Arrays.toString(randomArray));
            }
        }
        return randomArray;
    }
}
