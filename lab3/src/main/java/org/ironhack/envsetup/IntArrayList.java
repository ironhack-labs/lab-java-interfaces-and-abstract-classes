package org.ironhack.envsetup;

public class IntArrayList implements IntList{
    private int[] data = new int[10];
    private int size = 0;

    @Override
    public void add (int number) {
        if(size == data.length) {
            int newLength = data.length + data.length / 2;
            int[] newData = new int[newLength];

            for (int i = 0; i< data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size++] = number;
    }
    @Override
    public int get(int id) {
        return data[id];
    }
}
