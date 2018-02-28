package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Oleg Perov(fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */


public class Square {
    /**
     * Заполнить метод public int[] calculate(int bound) через цикл элементами от 1 до      * bound возведенными в квадрат.
     *
     * @return массив c числами возведенными в квадрат.
     */

    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (int) Math.pow(i, 2);
        }
        return rst;
    }


}
