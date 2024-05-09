package IntListInterface;

public class IntVector implements IntList {

    // Properties
    private int[] numbers = new int[20];
    private int size = 0;


    //Methods
    public void add(int number) {
        if (size == numbers.length) {
            int[] newNumbers = new int[numbers.length * 2];
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
