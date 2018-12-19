package ru.job4j.array;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Oleg Perov(fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class MatrixCheck {
    /**
     * public boolean mono(boolean[][] data)
     *
     * @return должен проверить, что все элементы по диагоналям равны true или false.
     */
    public boolean mono(boolean[][] data) {

        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i=0; i<data.length; i++) {
            toright &= (data[i][i] == true);
            toleft &= (data[data.length-i-1][i] == false);
        }

        if (toright || toleft) return true;

        return false;
    }
}



