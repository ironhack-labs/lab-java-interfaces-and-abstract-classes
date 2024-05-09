package IntListInterface;

public class IntArrayList implements IntList {


    // Properties
    private int[] numbers = new int[10];
    private int size = 0;


    // Constructor
    public IntArrayList(int[] numbers, int size) {
        this.numbers = numbers;
        this.size = size;
    }


    //Methods
    public void add(int number) {
        if (size == numbers.length) {
            int[] newNumbers = new int[numbers.length + (numbers.length/2)];
            System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
            numbers = newNumbers;
        }
        numbers[size] = number;
        size++;
    }

    public int get(int id) {
        return numbers[id];
    }

}
