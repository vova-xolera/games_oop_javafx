package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {
    @Test
    public void positionCheck() {
        assertThat(new BishopBlack(Cell.H3).position(), is(Cell.H3));
    }
    @Test
    public void copyCheck() {
        assertThat(new BishopBlack(Cell.H3).copy(Cell.H5).position(), is(Cell.H5));
    }
    @Test
    public void wayCheck() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cells = {Cell.C1, Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.C1, Cell.G5), is(cells));
    }
}
