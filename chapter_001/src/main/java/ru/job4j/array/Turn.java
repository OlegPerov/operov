package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Oleg Perov(fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Turn {
    /**
     * Mетод public int[] back(int[] array).
     *
     * @return должен перевернуть массив задом наперёд.
     */
    public int[] back(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length / 2; i++) {
            index = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = index;
        }
        return array;
    }
}

