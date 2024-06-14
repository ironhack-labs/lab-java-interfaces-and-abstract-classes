// IntList interface
interface IntList {
    void add(int number);
    int get(int id);
}

// IntArrayList implementation
class IntArrayList implements IntList {
    private int[] array;
    private int size;

    public IntArrayList() {
        array = new int[10]; // Default initial size
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            // Resize the array by 50%
            int newSize = (int) (array.length * 1.5);
            int[] newArray = new int[newSize];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return array[id];
    }
}

// IntVector implementation
class IntVector implements IntList {
    private int[] array;
    private int size;

    public IntVector() {
        array = new int[20]; // Default initial size
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            // Resize the array to double its current size
            int newSize = array.length * 2;
            int[] newArray = new int[newSize];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return array[id];
    }
}

// Example usage:
public class Main {
    public static void main(String[] args) {
        IntList list1 = new IntArrayList();
        list1.add(5);
        list1.add(10);

        IntList list2 = new IntVector();
        list2.add(7);
        list2.add(15);
    }
}
