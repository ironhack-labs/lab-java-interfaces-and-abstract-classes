public class IntArrayList implements IntList {

    private int[] numbers;
    private int size;

    public IntArrayList() {
        numbers = new int[10];
        size = 0;
    }

    public void add(int number) {
        if (size == numbers.length) {
            int[] newNumbers = new int[numbers.length + numbers.length / 2];

            for (int i = 0; i < numbers.length; i++) {
                newNumbers[i] = numbers[i];
            }

            numbers = newNumbers;
        }

        numbers[size] = number;
        size++;
    }

    public int get(int id) {
        return numbers[id];
    }
}