package ru.job4j.max;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *MaxTest.
 *
 * @author Oleg Perov (fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class MaxTest {
    @Test
public void whenFirstLessSecond() {
    Max maxim = new Max();
    int result = maxim.m(5,2,8);
    assertThat(result, is(8));
}
}