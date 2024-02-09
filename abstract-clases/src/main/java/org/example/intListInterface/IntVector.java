package org.example.intListInterface;
import java.util.Arrays;

public class IntVector implements IntList {

    final int initialLength = 20;
    int arrayLength;
    int[] arrayNumberList = new int[initialLength];
    int indice;

    public IntVector(){
        this.arrayLength = this.initialLength;
        this.indice = 0;
    }
    public void add(int number){
        if (arrayLength <= indice ){
            arrayLength = arrayLength*2;
            arrayNumberList = Arrays.copyOf(arrayNumberList, arrayLength);
        }
        arrayNumberList[indice] = number;
        indice++;
    }

    public int get(int id){
        id--;
        if (id < 0 || id >= arrayLength) {
            throw new IndexOutOfBoundsException("Index out of array, select a position between 1 and "+arrayLength);
        }
        return arrayNumberList[id];
    }
}
