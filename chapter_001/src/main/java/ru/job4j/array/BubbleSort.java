package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Oleg Perov(fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class BubbleSort {
    /**
     * ћетод public int[] sort(int[] array).
     *
     * @return должен сортировать массив целых чисел, использу€ алгоритм сортировки пузырьком.
     */

    public int[] sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
   
}

