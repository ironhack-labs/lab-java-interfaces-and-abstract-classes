package IntList;

import java.util.Arrays;

public class IntArrayList implements IntList {
    public int maxArrSize = 10;
    private int[] arrList;
    private int counter = 0;

    public IntArrayList() {
        setArrList(new int[maxArrSize]);
    }

    public int[] getArrList() {
        return arrList;
    }

    public void setArrList(int[] arrList) {
        this.arrList = arrList;
    }

    @Override
    public void add(int number) {
        if (isArrListFull(counter)) {
            maxArrSize += Math.round(maxArrSize * 0.5);
            arrList = Arrays.copyOf(arrList, maxArrSize);
        }
        System.out.println("arrList.length - " + arrList.length);
        arrList[counter++] = number;
    }

    @Override
    public int get(int id) {
        return arrList[id];
    }

    public boolean isArrListFull(int counter) {
        return arrList.length <= counter;
    }
}
