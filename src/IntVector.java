public class IntVector implements IntList {

    private int[] numbers;
    private int size;

    public IntVector() {
        numbers = new int[20];
        size = 0;
    }

    public void add(int number) {
        if (size == numbers.length) {
            int[] newNumbers = new int[numbers.length * 2];

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
