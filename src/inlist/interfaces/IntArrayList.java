package inlist.interfaces;

public class IntArrayList implements InList {

    private int[] intArray;

    @Override
    public void add(int number) {
        if (intArray == null){
            intArray = new int[10];
            intArray[0] = number;
        }     }

    @Override
    public int get(int id) {
        return 0;
    }

}
