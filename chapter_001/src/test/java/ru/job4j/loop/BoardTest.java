package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        String ln = System.lineSeparator();
        String expected = String.format("X X%s X %sX X%s", ln, ln, ln);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        //напишите здесь тест, проверяющий формирование доски 5 на 4.
        Board board = new Board();
        String rsl = board.paint(4, 5);
        String ln = System.lineSeparator();
        String expected = String.format("X X X%s X X %sX X X%s X X %s", ln, ln, ln, ln);
        assertThat(rsl, is(expected));

    }
}

