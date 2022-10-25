package com.beridzzze.lesson2_3;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int i, int j, NumberFormatException e) {
        super("Ошибочный тип данных в строке " + i + " и столбце " + j + ". " + e.getMessage(), e);
    }


}
