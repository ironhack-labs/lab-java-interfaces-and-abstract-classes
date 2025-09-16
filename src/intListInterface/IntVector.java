package intListInterface;

public class IntVector implements IntList{

    int[] numbers;
    int size;

    IntVector () {
        numbers = new int[20];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == numbers.length) {
            int[] newNumbers = new int[numbers.length * 2];
            for (int i = 0; i < size; i++) {
                newNumbers[i] = numbers[i];
            }
            numbers = newNumbers;
        }
        numbers[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        return numbers[id];
    }
}
