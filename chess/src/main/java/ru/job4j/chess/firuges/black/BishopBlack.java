package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        if (!isDiagonal(source, dest)) {
            throw new IllegalStateException(
                    String.format("Could not way by diagonal from %s to %s", source, dest)
            );
        }
        int size = Math.abs(source.x - dest.x) + 1;
        Cell[] steps = new Cell[size];
        int deltaX = (dest.x - source.x) / Math.abs(dest.x - source.x);
        int deltaY = (dest.y - source.y) / Math.abs(dest.y - source.y);
        for (int index = 0; index < size; index++) {
            steps[index] = Cell.findBy(source.x + deltaX * index, source.y + deltaY * index);
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return !source.equals(dest) && Math.abs(source.x - dest.x) - Math.abs(source.y - dest.y) == 0;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
