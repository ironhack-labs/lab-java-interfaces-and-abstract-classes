package inlist.interfaces;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IntVectorTest {

    @Test
    void get() {
        IntVector intVector = new IntVector();

        IntStream.range(0, 10).forEach(intVector::add);

        assertEquals(9, intVector.get(9));
        assertThrows(IndexOutOfBoundsException.class, () -> intVector.get(10));
    }

    @Test
    void add() {
        IntVector intVector = new IntVector();

        IntStream.range(0, 20).forEach(intVector::add);
        intVector.add(22);

        assertEquals(22, intVector.get(20));
    }
}