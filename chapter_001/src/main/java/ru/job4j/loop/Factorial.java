package ru.job4j.loop;


/**
 * @author Oleg Perov(fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Factorial {
    /**
     * Метод calc принимает положительное целое число n
     *
     * @return возвращает рассчитанный факториал для заданного числа;
     */


    public int calc(int n) {

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;

        }
        return factorial;
    }


}