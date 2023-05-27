public class Validation {
    public int checkingValue(String number) {
        int n = 0;
        try {
            n = Integer.parseInt(number);
            if (n <= 0) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка!!! Число должно быть целым, положительным и больше нуля");
        }
        return n;
    }
}
