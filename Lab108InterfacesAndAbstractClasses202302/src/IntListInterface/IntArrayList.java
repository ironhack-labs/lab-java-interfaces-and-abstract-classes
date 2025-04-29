package IntListInterface;


public class IntArrayList implements IIntList {
    private int[] numbers;
    private int count;

    public IntArrayList() {
        this.numbers = new int[10];//array con 10 posiciones
        this.count = 0;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int[] addNumber(int number) {
        if (this.count == this.numbers.length) {
            int newLength = this.numbers.length + this.numbers.length / 2;
            int[] newNumbers = new int[newLength];
            System.arraycopy(this.numbers, 0, newNumbers, 0, this.numbers.length);
            // System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
            this.numbers = newNumbers;

        }
        this.numbers[this.count] = number;
        this.count++;
        return this.numbers;
    }

    @Override
    public int id(int number) {
        for (int i = 0; i < this.count; i++) {
            if (this.numbers[i] == number) {
                return i;
            }
        }
        return -1; // Retorna -1 si no se encuentra
    }
}