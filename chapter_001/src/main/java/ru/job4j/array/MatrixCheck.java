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
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            result = result & (data[i][i] == true);
        }
        if (result)
            return true;
        {
        }
        return result;
    }
}



