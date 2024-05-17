package IntListInterface;

import java.util.Vector;

public class IntVector implements IntList {
        private Vector<Integer> numbers;

    public IntVector(Vector<Integer> numbers) {
        this.numbers = numbers;
    }

    public static void main(String[] args) {

    }

    @Override
    public void addNumber(int number) {

    }

    @Override
    public int getId(int id) {
        return 0;
    }
}
