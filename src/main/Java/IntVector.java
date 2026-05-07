package Java;

public class IntVector implements IntList {

    private int[] numbers;
    private int size;

    public IntVector() {
        numbers = new int[20];
        size = 0;
    }

    @Override
    public void add(int number) {

        if (size == numbers.length) {

            int[] newArray = new int[numbers.length * 2];

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
