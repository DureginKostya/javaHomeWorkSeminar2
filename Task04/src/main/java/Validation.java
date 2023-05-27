import java.util.Scanner;

public class Validation {
    Scanner scanner;
    {
        scanner = new Scanner(System.in);
    }
    boolean flag;
    public double validationEnterNumber() {
        System.out.print("Введите число: ");
        String number = scanner.next();
        double enterNumber = 0;
        flag = true;
        while (flag) {
            try {
                enterNumber = Double.parseDouble(number);
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("!!! Введено не число, пожалуйста повторите ввод !!!");
                System.out.print("Число: ");
                number = scanner.next();
            }
        }
        return enterNumber;
    }
    public char validationEnterOperator() {
        System.out.print("Выполнить: ");
        String operator = scanner.next().trim();
        Calc calc = new Calc();
        char enterOperator = ' ';
        flag = true;
        while (flag) {
            if ((operator.equals("*")) || (operator.equals("/")) || (operator.equals("+")) || (operator.equals("-")) || (operator.equals("="))) {
                enterOperator = operator.charAt(0);
                flag = false;
            } else {
                System.out.println("!!! Введен неправильный оператор, пожалуйста повторите ввод !!!");
                calc.printHint();
                System.out.print("Выполнить: ");
                operator = scanner.next().trim();
            }
        }
        return enterOperator;
    }
    public double validationEnterNumberZero() {
        double userValue = validationEnterNumber();
        flag = true;
        while (flag) {
            if (userValue != 0) {
                flag = false;
            } else {
                System.out.println("!!! Делить на ноль нельзя !!!");
                userValue = validationEnterNumber();
            }
        }
        return userValue;
    }
}
