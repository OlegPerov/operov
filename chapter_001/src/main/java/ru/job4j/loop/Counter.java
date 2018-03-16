package ru.job4j.loop;


import ru.job4j.array.Square;

/**
 * @author Oleg Perov(fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */


public class Counter {
    /**
     * Диапазон значений от start до finish
     *
     * @return возвращает сумму чётных чисел, равную 30
     */
    public int add(int start, int finish) {
        int summa = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0)
                summa = summa + i;
        }
        return summa;
    }
}