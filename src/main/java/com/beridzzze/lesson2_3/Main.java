package com.beridzzze.lesson2_3;

//        1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
//        при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//        2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
//        Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
//        должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//        3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
//        и вывести результат расчета.


public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        String[][] a = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}};
        try {
            System.out.println(main.sumArray(a));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public int sumArray(String a[][]) {
        if (a.length != 4
                || a[0].length != 4
                || a[1].length != 4
                || a[2].length != 4
                || a[3].length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(a[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, e);
                }
            }
        }

        return sum;

    }

}
