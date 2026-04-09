package IntListInterface;

import java.util.Arrays;

public class IntArrayList implements IntList{
    private int[] array;
    private int size;

    public IntArrayList() {
        this.array = new int [10];
        this.size = 0;
    }

    @Override
    public void add(int number) {

        if (size == array.length) {
            // Calcular el nuevo tamaño: el actual + 50% (la mitad)
            int newSize = array.length + (array.length / 2);


            array = Arrays.copyOf(array, newSize);
            System.out.println("IntArrayList ha crecido a tamaño: " + newSize); // Para que lo veas en consola
        }

        array[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        // Devuelve el elemento en la posición 'id'
        if (id >= 0 && id < size) {
            return array[id];
        }
        throw new IndexOutOfBoundsException("ID fuera de rango");
    }
}
