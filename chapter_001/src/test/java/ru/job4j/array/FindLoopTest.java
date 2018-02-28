package ru.job4j.array;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * FindLoopTest.
 *
 * @author Oleg Perov (fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class FindLoopTest {
    @Test
    public void whenFindElementArray() {
        FindLoop findLoop = new FindLoop();
        int result = 3;
        int array = findLoop.indexOf(new int[]{0, 1, 2, 3, 4, 5}, 3);
        assertThat(array, is(result));

    }

    @Test
    public void whenNotFindElementArray() {
        FindLoop findLoop = new FindLoop();
        int result = 5;
        int array = findLoop.indexOf(new int[]{0, 1, 2, 3, 4, 5}, 6);
        assertThat(array, is(result));

    }


}
