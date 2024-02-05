public class IntArrayList implements IntList {
    private int[] numbers;
    private int size;
    private int capacity;

    public IntArrayList() {
        numbers = new int[10]; // Initial capacity of 10
        size = 0;               // Initially, the array holds 0 elements
        capacity = 10;          // Initial capacity
    }

    public int add(int number) {
        // Check if we need to expand the array
        if (size == capacity) {
            // Increase capacity by 50%
            int newSize = capacity + (capacity / 2);
            int[] newArray = new int[newSize];

            // Copy elements
            for (int i = 0; i < size; i++) {
                newArray[i] = numbers[i];
            }

            numbers = newArray;
            capacity = newSize;
        }

        numbers[size] = number;
        size++; // Increment size as we've added a new element
        return size;
    }

    public int size() {
        return size;
    }

    @Override
    public int get(int index) {
        return numbers[index];
    }
}

