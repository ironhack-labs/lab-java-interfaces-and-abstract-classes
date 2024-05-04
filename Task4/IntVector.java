package Task4;

public class IntVector implements IntList {

    int size = 20;
    int currentIndex = 0;
    Integer[] numberArray = new Integer[size];

    @Override
    public void add(int number) {
        if (currentIndex == numberArray.length) {
            Integer[] numberArray2 = new Integer[numberArray.length * 2];
            System.arraycopy(numberArray, 0, numberArray2, 0, numberArray.length);
            numberArray = numberArray2;
        }
        numberArray[currentIndex++] = number;

    }
    public int get(int id) {
        if (id < 0 || id >= currentIndex) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return numberArray[id];
    }
}
