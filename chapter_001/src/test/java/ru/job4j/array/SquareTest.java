package ru.job4j.array;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * SquareTest.
 *
 * @author Oleg Perov (fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class SquareTest {
    @Test
    public void whwhenFirst() {
        Square square = new Square();
        int[] result = new int[]{0, 1, 4, 9, 16};
        int[] array = square.calculate(5);
        assertThat(array, is(result));

    }


}
