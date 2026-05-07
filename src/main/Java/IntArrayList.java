package Java;

public class IntArrayList implements IntList {

    private int[] numbers;
    private int size;

    public IntArrayList() {
        numbers = new int[10];
        size = 0;
    }

    @Override
    public void add(int number) {

        // Check if array is full
        if (size == numbers.length) {

            int newLength = numbers.length + (numbers.length / 2);

            int[] newArray = new int[newLength];

            // Copy elements
            for (int i = 0; i < numbers.length; i++) {
                newArray[i] = numbers[i];
            }

            numbers = newArray;
        }

        numbers[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        return numbers[id];
    }
}
