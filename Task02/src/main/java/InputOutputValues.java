import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InputOutputValues {
    Validation validation;
    {
        validation = new Validation();
    }
    public int getRangeArray() {
        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;
        String number;
        boolean flag = true;
        while (flag) {
            System.out.print("Введите размерность массива: ");
            number = scanner.next();
            userNumber = validation.checkingValue(number);
            if (userNumber > 0) flag = false;
        }
        return userNumber;
    }
    public int[] getRandomArray(int n) {
        Random random = new Random();
        int[] randomArray = new int[n];
        for (int i = 0; i < n; i++) {
            randomArray[i] = random.nextInt(20);
        }
        return randomArray;
    }
    public void printArray(String msg, int[] randomArray) {
        StringBuilder sB = new StringBuilder(msg);
        sB.append(Arrays.toString(randomArray));
        System.out.println(sB);
    }
}
