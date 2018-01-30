package ru.job4j.loop;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * CounterTest.
 *
 * @author Oleg Perov (fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class CounterTest {
    @Test
public void whenSumEvenNumbersFromOneToTenThenThirty() {

    Counter sum = new Counter();
    int result = sum.add(0,10);
    assertThat(result, is(30));
}
}