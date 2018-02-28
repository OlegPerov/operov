package ru.job4j.array;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * TurnTest.
 *
 * @author Oleg Perov (fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] result = new int[]{2, 6, 1, 4};
        int[] array = turn.back(new int[]{4, 1, 6, 2});
        assertThat(array, is(result));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] result = new int[]{5, 4, 3, 2, 1};
        int[] array = turn.back(new int[]{1, 2, 3, 4, 5});
        assertThat(array, is(result));
    }
}