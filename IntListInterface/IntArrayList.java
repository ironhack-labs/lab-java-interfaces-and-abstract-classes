package IntListInterface;

public class IntArrayList implements IntList {
    private int[] numbers;
    private int elements;

    public IntArrayList() {
        numbers = new int[10];
        elements = 0;
    }

    @Override
    public void addNumber(int number) {
        if (elements >= numbers.length) {
            resizeArray();
        }
        numbers[elements] = number;
        elements++;
    }

    private void resizeArray() {
        int newElements = numbers.length + numbers.length / 2;
        int[] newArray = new int[newElements];
        System.arraycopy(numbers, 0, newArray, 0, numbers.length);
        numbers = newArray;
    }

    @Override
    public int getId(int id) {
        return 0;
    }

    public static void main(String[] args) {
        IntArrayList myList = new IntArrayList();
        for (int i = 0; i <= 15; i++) {
            myList.addNumber(i);
        }
        for (int i = 0; i<myList.elements; i++) {
            System.out.println(myList.getId(i));
        }
    }
}
