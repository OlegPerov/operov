package ru.job4j.max;

/**
 * @author Oleg Perov(fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Принимает 2 значения ( int first, int second)
     * @return возвращает максимальное число
     */
    public int max(int first, int second)
    {
          return first > second ? first: second;
    }

    public int m (int first, int second, int therd){

        int max1 = max(first,second);
        int max2 = max(max1,therd);
        return max2;
    }
}
