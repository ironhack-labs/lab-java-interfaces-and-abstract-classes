public class IntVector implements IntList {
    // should store numbers in an array with a length of 20 by default.
    // When the add method is called, you must first determine if the array is full.
    // If it is, create a new array that is double the size of the current array,
    // move all elements over to the new array and add the new element.

    private int[] arrayInts;
    private int capacity;
    private int filledPositions;

    public IntVector() {
        setCapacity(capacity);
        setFilledPositions(filledPositions);
        setArrayInts(getCapacity());
    }
    private void setArrayInts(int capacity) {
        this.arrayInts = new int[capacity];
    }

    private void setCapacity(int capacity) {
        this.capacity = 20;
    }
    private void setFilledPositions(int filledPositions) {
        this.filledPositions = 0;
    }

    public int[] getArrayInts() {
        return arrayInts;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFilledPositions() {
        return filledPositions;
    }

    public void add(int number) {
        if (filledPositions == capacity) {
            int oldCapacity = getCapacity();
            int[] oldArrayInts = getArrayInts();
            this.capacity = getCapacity() * 2;
            int[] newArrayInts = new int[capacity];

            System.arraycopy(oldArrayInts, 0, newArrayInts, 0, oldArrayInts.length);
            newArrayInts[oldArrayInts.length] = number;
            this.arrayInts = newArrayInts;
            this.filledPositions = oldCapacity + 1;
        } else {
            this.arrayInts[filledPositions] = number;
            this.filledPositions = filledPositions + 1;
        }
    }

    public int get(int id) {
        return arrayInts[id];
    }
}
