package ru.job4j.array;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * MatrixTest.
 *
 * @author Oleg Perov (fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class MatrixTest {
    @Test
    public void whenMultiplicationTableByFour() {
        Matrix matrix = new Matrix();
        int[][] result = new int[][]{{0, 0, 0, 0}, {0, 1, 2, 3}, {0, 2, 4, 6}, {0, 3, 6, 9}};
        int[][] array = matrix.multiple(4);
        assertThat(array, is(result));
    }

    @Test
    public void whenMultiplicationTableByFive() {
        Matrix matrix = new Matrix();
        int[][] result = new int[][]{{0, 0, 0, 0, 0}, {0, 1, 2, 3, 4}, {0, 2, 4, 6, 8}, {0, 3, 6, 9, 12}, {0, 4, 8, 12, 16}};
        int[][] array = matrix.multiple(5);
        assertThat(array, is(result));
    }

}