package ru.job4j.array;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Oleg Perov(fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Matrix {
    /**
     * Mетод int[][] multiple(int size).
     *
     * @return должен вернуть Матрицу  в виде таблицы умножения.
     */
    public int[][] multiple(int size) {

        int[][] array = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }
}



