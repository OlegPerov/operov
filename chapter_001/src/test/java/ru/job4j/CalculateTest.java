package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * 
 * @author Oleg Perov (fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */

 public class CalculateTest  {
 /**
 *  Test echo.
 */ @Test 
 public void whenTakenNameThenTreeEchoPlusName () {
      String input = "Oleg Perov";
      String expect = "Echo, echo, echo : Oleg Perov";
      Calculate calc = new Calculate();
      String result = calc.echo(input);
      assertThat(result, is(expect));         
}

}