package IntLIstInterfyce;

import java.util.ArrayList;

public class IntArrayList implements IntList {
private int[] array = new int[10];
private int size=0;

    @Override
    public void add(int number) {
        if (size == array.length) {
            int newLength = array.length + array.length / 2;
            int[] newArray = new int[newLength];
            for (int i = 0; i < size ; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        array[size] = number;
        size++;
    }
public int get(int id){
    if (id < 0 || id >= size) {
        throw new IndexOutOfBoundsException("Invalid index: " + id);}
    return array[id];
}
public int size(){
        return size;
}
    }
