package ru.job4j.array;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * BubbleSortTest.
 *
 * @author Oleg Perov (fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        int[] array = bubbleSort.sort(new int[]{1, 5, 4, 2, 3, 1, 7, 8, 0, 5});
        assertThat(array, is(result));

    }




}
