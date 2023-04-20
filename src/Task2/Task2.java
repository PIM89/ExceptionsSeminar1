package Task2;

/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов
двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] ints1 = {1, 3, 5, 6, 4, 7, 8, 9, 10};
        int[] ints2 = {5, 8, 6, 4, 7, 2, 3, 8, 70, 5};

        for (int elem : diffTwoArrayElem(ints1, ints2)) {
            System.out.print(elem + " ");
        }
    }

    public static int[] diffTwoArrayElem(int[] ints1, int[] ints2) {
        if (ints1 == null || ints2 == null) {
            throw new RuntimeException("Массив(массивы) пуст(пусты)");
        }
        if (ints1.length != ints2.length) {
            throw new RuntimeException("Размерность массивов отличается");
        }
        int[] res = new int[ints1.length];
        for (int i = 0; i < ints1.length; i++) {
            res[i] = ints1[i] - ints2[i];
        }
        return res;
    }
}
