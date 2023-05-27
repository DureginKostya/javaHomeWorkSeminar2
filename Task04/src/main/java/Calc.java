import java.util.logging.Level;
import java.util.logging.Logger;

public class Calc {
    private static Logger logger = Log.log(Calc.class.getName());
    public void printHint() {
        String msg = new StringBuilder()
                .append("Введите одно из действий:\n")
                .append("1. Умножение - << * >>\n")
                .append("2. Деление - << / >>\n")
                .append("3. Сложение - << + >>\n")
                .append("4. Вычитание - << - >>\n")
                .append("5. Вывести результат - << = >>")
                .toString();
        System.out.println(msg);
    }
    public void bodyCalc() {
        Validation validation = new Validation();
        boolean flag = true;
        char userOperator;
        double result = validation.validationEnterNumber();
        while (flag) {
            printHint();
            userOperator = validation.validationEnterOperator();
            switch (userOperator) {
                case '*' -> result *= validation.validationEnterNumber();
                case '/' -> result /= validation.validationEnterNumberZero();
                case '+' -> result += validation.validationEnterNumber();
                case '-' -> result -= validation.validationEnterNumber();
                case '=' -> flag = false;
            }
        }
        printResult(result);
    }
    public void printResult(double number) {
        if (number % 1 == 0) {
            System.out.printf("Результат: %.0f", number);
        } else {
            System.out.printf("Результат: %.3f", number);
        }
        logger.log(Level.INFO, Double.toString(number));
    }
}
