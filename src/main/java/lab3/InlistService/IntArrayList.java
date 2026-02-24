package lab3.InlistService;

public class IntArrayList implements IntList {

    int[] array = new int[10];
    private int size = 0;

    @Override
    public void add(int number) {

        if (size == array.length) {
            int[] newArray = new int[array.length + array.length / 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        array[size] = number;
        size++;


    }

    @Override
    public int get(int Id) {
        return 0;
    }


}
