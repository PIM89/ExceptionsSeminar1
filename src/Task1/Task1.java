package Task1;

import java.text.DecimalFormat;

/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */
public class Task1 {
    public static void main(String[] args) {
        String[] sArray = {"Строка 1", null, "Строка 3"};
        int[] array = {8, 9, 1, 0, 15, 65, 81, 1, 5, 6, 1};
        division(5, 0);
        printValueByIndex(array, 12);
        printStringArray(sArray);

    }

    // Деление на 0
    public static void division(double num1, double num2) {
        if (num2 == 0) {
            throw new RuntimeException("Ошибка при делении на 0");
        }
        double result = num1 / num2;
        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.printf("Результат деления равен: " + formatter.format(result));
    }

    // Выход за пределы границ массива
    public static void printValueByIndex(int[] array, int index) {
        if (index > array.length - 1) {
            throw new RuntimeException("Элемента под таким индексом не существует");
        } else {
            System.out.printf("Элемент с индексом %d равен %d.\n", index, array[index]);
        }
    }

    // Проверка на null
    public static void printStringArray(String[] sArray) {
        for (String item : sArray) {
            if (item == null) {
                throw new RuntimeException("Элемент отсутствует");
            }
            System.out.println(item);
        }
    }
}
