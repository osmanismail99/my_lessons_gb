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
        String[][] arr = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        myMethod(arr);
    }

    public static void myMethod(String arr[][]) {
        int arrLength = arr.length * arr[0].length;
        int[][] arr2 = new int[4][4];
        int sum = 0;
        if (arrLength < 16) {
            throw new MyArraySizeException("Массив должен быть 4х4");
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    try {
                        arr2[i][j] = Integer.parseInt(arr[i][j]);
                        sum+=arr2[i][j];
                    } catch (Exception ex) {
                        throw new MyArrayDataException("Error on " + i + " x " + j);
                    }
                }
            }
            System.out.println(sum);
        }
    }

}
