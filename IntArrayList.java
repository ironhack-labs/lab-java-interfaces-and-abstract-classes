public class IntArrayList implements IntList{

    /*
    IntArrayList should store numbers in an array with a length of 10 by default.
    When the add method is called, you must first determine if the array is full.
    If it is, create a new array that is 50% larger, move all elements over to the new array
    and add the new element. (For example, an array of length 10 would be increased to 15.)
     */

    public IntArrayList() {
        this.array = new int[maxArraySize];
        this.currentSize = 0;
    }


    @Override
    public void add(int number) {

        if(getCurrentSize() < getMaxArraySize()){
            array[getCurrentSize()]=number;
            currentSize++;
        }else{
            maxArraySize *= 1.5f;
            int[] newArray = new int[maxArraySize];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array=newArray;
            array[currentSize] = number;
            currentSize++;
        }

    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= currentSize) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[id];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public int getMaxArraySize() {
        return maxArraySize;
    }

    public void setMaxArraySize(int maxArraySize) {
        this.maxArraySize = maxArraySize;
    }

    private int maxArraySize = 10;
    private int[] array;
    private int currentSize;
}
