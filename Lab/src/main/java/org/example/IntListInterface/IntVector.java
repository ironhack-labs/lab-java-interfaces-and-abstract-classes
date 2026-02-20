package org.example.IntListInterface;

public class IntVector implements IntList {
    int[] arr = new int[20];
    int size = 0;

    @Override
    public void add(int number) {
        if(arr.length == size) {
            int[] newData = new int[arr.length*2];
            System.arraycopy(arr, 0, newData, 0, size);
            arr = newData;
            arr[size++] = number;
        }
        else  {
            arr[size++] = number;
        }
    }

    @Override
    public int get(int id) {
        if(id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Enter valid index");
        }
        return arr[id];
    }
}
