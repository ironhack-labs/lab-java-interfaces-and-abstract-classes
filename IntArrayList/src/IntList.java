//Have no idea what I did here, followed the classes and the solutions from IntelliJ hints.

//Create an IntList interface with the following methods:
//add(int number): a method that adds a new number to the list
//get(int id): a method that retrieves an element by its ID


interface IntList {
    void add(int number);
    int get(int id);
}

//Create two implementations of IntList: IntArrayList and IntVector.

class IntArrayList implements IntList {
    private int[] array;
    private int size;

    public IntArrayList() {
        array = new int[10];
        size = 0;
    }

//Until here was so nice...

    @Override
    public void add(int number) {
        if (size == array.length) {
            int[] newArray = new int[array.length + array.length / 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[id];
    }
}

class IntVector implements IntList {
    private int[] array;
    private int size;

    public IntVector() {
        array = new int[20];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[id];
    }
}
// What the hell happened?