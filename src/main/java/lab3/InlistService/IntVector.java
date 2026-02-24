package lab3.InlistService;

public class IntVector implements IntList {

    int[] array2 = new int[20];
    private int size = 0;

    @Override
    public void add(int number) {

        if (size == array2.length) {
            int[] newArray = new int[size * 2];
            for (int i = 0; i < array2.length; i++) {
                newArray[i] = array2[i];
            }
            array2 = newArray;
        }

        array2[size] = number;
        size++;

    }

    @Override
    public int get(int Id) {
        return 0;
    }


}
