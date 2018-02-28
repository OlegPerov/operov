package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Oleg Perov(fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class FindLoop {
    /**
     * Реализовать метод поиска элемента в массиве.
     *
     * @return должен вернуть индекс элемента.
     */

    public int indexOf(int[] data, int el) {

        int rsl = -1; // если элемента нет в массиве, то возвращаем -1.

        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rsl = index;

                break;
            }
        }

        return rsl;
    }

}

