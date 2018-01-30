package ru.job4j.loop;


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
        int number = 0;
        for (int i = start; i <= finish; i += 2) {
            number = number + i;
        }
        return number;
    }
}