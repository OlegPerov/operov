package ru.job4j.array;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * CharTest.
 *
 * @author Oleg Perov (fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class CharTest {
    @Test
    public void whenContainsOriginSubThenTrue() {
        Char word = new Char();
        boolean result = word.contains("Привет", "иве");
        assertThat(result, is(true));
    }

    @Test
    public void whenContainsOriginSubThenTruOne() {
        Char word = new Char();
        boolean result = word.contains("Привет", "ет");
        assertThat(result, is(true));
    }

    @Test
    public void whenContainsOriginSubThenTrueTwo() {
        Char word = new Char();
        boolean result = word.contains("Привет", "кр");
        assertThat(result, is(false));
    }

    @Test
    public void whenContainsOriginSubThenTrueThree() {
        Char word = new Char();
        boolean result = word.contains("Привет", "Т");
        assertThat(result, is(false));
    }

}
