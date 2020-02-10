package ru.job4j.chess.firuges.white;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopWhiteTest {
    @Test
    public void positionCheck() {
        assertThat(new BishopWhite(Cell.H3).position(), is(Cell.H3));
    }
    @Test
    public void copyCheck() {
        assertThat(new BishopWhite(Cell.H3).copy(Cell.H5).position(), is(Cell.H5));
    }
    @Test
    public void wayCheck() {
        BishopWhite bishopWhite = new BishopWhite(Cell.C1);
        Cell[] cells = {Cell.C1, Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopWhite.way(Cell.C1, Cell.G5), is(cells));
    }
}
