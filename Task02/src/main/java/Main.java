// Задание №2. Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

public class Main {
    public static void main(String[] args) {
        InputOutputValues ioValues = new InputOutputValues();
        MySorted mySorted = new MySorted();
        int[] userArray = ioValues.getRandomArray(ioValues.getRangeArray());
        ioValues.printArray("Сгенерированный массив: ", userArray);
        int[] mySortedArray = mySorted.sortedArray(userArray);
        ioValues.printArray("Отсортированный массив: ", mySortedArray);
    }
}
