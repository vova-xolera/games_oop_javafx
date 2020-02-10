package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicMoveTest {

    @Test
    public void moveTest() {
        Logic logic = new Logic();
        boolean result = logic.move(Cell.B1, Cell.H7);
        assertThat(result, is(false));
    }
    @Test
    public void moveTest2() {
        Logic logic = new Logic();
        boolean result = logic.move(Cell.E2, Cell.E3);
        assertThat(result, is(true));
    }
}
