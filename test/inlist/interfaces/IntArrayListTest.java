package inlist.interfaces;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.IntStream;


class IntArrayListTest {

    @Test
    void get() {
        IntArrayList intArrayList = new IntArrayList();

        IntStream.range(0, 10).forEach(intArrayList::add);

        assertEquals(9, intArrayList.get(9));
        assertEquals(0, intArrayList.get(10));
    }

    @Test
    void add() {
        IntArrayList intArrayList = new IntArrayList();

        IntStream.range(0, 10).forEach(intArrayList::add);
        intArrayList.add(22);

        assertEquals(22, intArrayList.get(10));
    }
}