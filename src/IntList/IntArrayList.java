package IntList;

public class IntArrayList implements IntList{
    // Constructors
    IntArrayList() {
        int initialMax = 10;

        arr = new int[initialMax];
        setSize(0);
        setArrMax(initialMax);
    }

    // Attributes
    private int[] arr;
    private int arrMax;
    private int size;

    // Getters and Setters
    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getArrMax() {
        return arrMax;
    }

    public void setArrMax(int arrMax) {
        this.arrMax = arrMax;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Methods
    @Override
    public void add(int number) {
        if (getSize() >= getArrMax())
        {
            setArr(copyAndGrow());
            setArrMax(Math.round(getArrMax() * 1.5f));
        }
        arr[getSize()] = number;
        setSize(getSize() + 1);
    }

    private int[] copyAndGrow() {
        // Create a new array with 50% more space
        int[] newArr = new int[Math.round(getArrMax() * 1.5f)];

        // Copy into new array the content of the old array
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    @Override
    public int get(int id) {
        if (id > getArrMax() - 1) {
            System.out.println("Cannot access position " + id + ", 0 was returned");
            return 0;
        }

        return arr[id];
    }
}
