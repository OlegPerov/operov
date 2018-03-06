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
        int[][] result = new int[][]{{1, 2, 3, 4}, {2, 4, 6, 8}, {3, 6, 9, 12}, {4, 8, 12, 16}};
        int[][] array = matrix.multiple(4);
        assertThat(array, is(result));
    }

    @Test
    public void whenMultiplicationTableByFive() {
        Matrix matrix = new Matrix();
        int[][] result = new int[][]{{1, 2, 3, 4, 5}, {2, 4, 6, 8, 10}, {3, 6, 9, 12, 15}, {4, 8, 12, 16, 20}, {5, 10, 15, 20, 25}};
        int[][] array = matrix.multiple(5);
        assertThat(array, is(result));
    }

}