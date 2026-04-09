package IntListInterface;

import java.util.Arrays;

public class IntVector implements IntList {
    private int[] array;
    private int size;


    public IntVector() {
        this.array = new int[20];
        this.size = 0;
    }

    @Override
    public void add(int number) {

        if (size == array.length) {
            // Calcular el nuevo tamaño: el doble del actual
            int newSize = array.length * 2;


            array = Arrays.copyOf(array, newSize);
            System.out.println("IntVector ha crecido a tamaño: " + newSize);
        }


        array[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        if (id >= 0 && id < size) {
            return array[id];
        }
        throw new IndexOutOfBoundsException("ID fuera de rango");
    }
}