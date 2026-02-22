/**
 * Interface defining the basic operations for a dynamic list of integers.
 * Implementations must support adding elements and retrieving them by index.
 */
interface IntList {
    
    /**
     * Appends the specified integer to the end of this list.
     *
     * @param number the integer to be added
     */
    void add(int number);

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (index < 0 || index >= size())
     */
    int get(int index);

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements currently stored
     */
    int size();
}

/**
 * Resizable array-based implementation of IntList.
 * Grows by 50% when capacity is reached (with +1 to avoid staying at 0).
 * Initial capacity: 10.
 */
class IntArrayList implements IntList {
    
    private static final int DEFAULT_CAPACITY = 10;
    private static final double GROWTH_FACTOR = 1.5;

    private int[] elements;
    private int size;

    /**
     * Constructs an empty IntArrayList with an initial capacity of 10.
     */
    public IntArrayList() {
        this.elements = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        ensureCapacity();
        elements[size++] = number;
    }

    /**
     * Increases the capacity if the array is full.
     * New capacity = current capacity * 1.5 + 1 (rounded down).
     */
    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = (int) (elements.length * GROWTH_FACTOR) + 1;
            int[] newElements = new int[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    @Override
    public int get(int index) {
        checkIndex(index);
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                "Index: " + index + ", Size: " + size);
        }
    }
}

/**
 * Resizable array-based implementation of IntList (Vector-style).
 * Doubles capacity when full.
 * Initial capacity: 20.
 */
class IntVector implements IntList {
    
    private static final int DEFAULT_CAPACITY = 20;
    private static final int GROWTH_FACTOR = 2;

    private int[] elements;
    private int size;

    /**
     * Constructs an empty IntVector with an initial capacity of 20.
     */
    public IntVector() {
        this.elements = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        ensureCapacity();
        elements[size++] = number;
    }

    /**
     * Increases the capacity if the array is full.
     * New capacity = current capacity * 2.
     */
    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * GROWTH_FACTOR;
            int[] newElements = new int[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    @Override
    public int get(int index) {
        checkIndex(index);
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                "Index: " + index + ", Size: " + size);
        }
    }
}

/**
 * Demonstration of IntArrayList and IntVector usage.
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== IntArrayList Demo ===");
        IntList arrayList = new IntArrayList();
        addDemoElements(arrayList);
        printList("IntArrayList", arrayList);

        System.out.println("\n=== IntVector Demo ===");
        IntList vector = new IntVector();
        addDemoElements(vector);
        printList("IntVector", vector);
    }

    private static void addDemoElements(IntList list) {
        for (int i = 1; i <= 25; i++) {
            list.add(i * 10);
        }
    }

    private static void printList(String name, IntList list) {
        System.out.println(name + " size: " + list.size());
        System.out.print("Elements: [");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}