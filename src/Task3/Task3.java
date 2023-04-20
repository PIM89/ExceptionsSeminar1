package Task3;
/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] ints1 = {1, 3, 5, 6, 4, 7, 8, 9, 10};
        int[] ints2 = {2, 0, 6, 4, 7, 2, 3, 8, 70};

        for (int elem : divTwoArrayElem(ints1, ints2)) {
            System.out.print(elem + " ");
        }

    }
    public static int[] divTwoArrayElem(int[] ints1, int[] ints2) {
        if (ints1 == null || ints2 == null) {
            throw new RuntimeException("Массив(массивы) пуст(пусты)");
        }
        if(ints1.length != ints2.length) {
            throw new RuntimeException("Размерность массивов отличается");
        }


        int[] resultArr = new int[ints1.length];
        for (int i = 0; i < resultArr.length; i++) {
            if (ints2[i] == 0) {
                throw new RuntimeException("Элемент второго массива равен 0. Ошибка деления.");
            }
            resultArr[i] = ints1[i]/ints2[i];
        }
        return resultArr;
    }

}
