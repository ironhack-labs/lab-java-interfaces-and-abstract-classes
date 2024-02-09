package inlist.interfaces;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class IntArrayListTest {

    @Test
    void get() {
        IntArrayList intArrayList = new IntArrayList();

        IntStream.range(0, 10).forEach(intArrayList::add);

        assertEquals(9, intArrayList.get(9));
        assertThrows(IndexOutOfBoundsException.class, () -> intArrayList.get(10));
    }

    @Test
    void add() {
        IntArrayList intArrayList = new IntArrayList();

        IntStream.range(0, 10).forEach(intArrayList::add);
        intArrayList.add(22);

        assertEquals(22, intArrayList.get(10));
    }
}