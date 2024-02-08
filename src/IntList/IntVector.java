package IntList;

import java.util.Arrays;

public class IntVector implements IntList {
    public int maxVectorSize = 20;
    private int[] arrVector;
    private int counter = 0;

    public IntVector() {
        setArrVector(new int[maxVectorSize]);
    }

    public int[] getArrVector() {
        return arrVector;
    }

    public void setArrVector(int[] arrVector) {
        this.arrVector = arrVector;
    }

    @Override
    public void add(int number) {
        if (isArrVectorFull(counter)) {
            maxVectorSize *= 2;
            arrVector = Arrays.copyOf(arrVector, maxVectorSize);
        }
        System.out.println("arrVector.length - " + arrVector.length);
        arrVector[counter++] = number;
    }

    @Override
    public int get(int id) {
        return arrVector[id];
    }

    public boolean isArrVectorFull(int counter) {
        return arrVector.length <= counter;
    }
}
