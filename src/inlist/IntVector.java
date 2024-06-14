package inlist;

public class IntVector implements IntList{
    private int[] myArray;
    private int size;
    public IntVector() {
        myArray = new int[20];
        size = 0;
    }

    @Override
    public void add(int number) {
        if(size == myArray.length){
            int newSize = myArray.length * 2;
            int[] newArray = new int[newSize];
            System.arraycopy(myArray, 0, newArray, 0, myArray.length);
            myArray = newArray;
        }
        myArray[size++] = number;
    }

    @Override
    public int get(int id) {
        if(id >= 0 && id < size){
            return myArray[id];
        } else {
            throw new ArrayIndexOutOfBoundsException("invalid id: " + id);
        }
    }
}
