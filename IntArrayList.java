import java.util.ArrayList;
import java.util.Arrays;

public class IntArrayList implements IIntList{
    private ArrayList<Integer> arrayList;
    //After checking work with AI; it relates that using both would be contradictory.
    //However, here's the limited way

    private int[] customList;
    private int customSize;

    public IntArrayList() {
        customList = new int[10];
        customSize = 0;
        arrayList = new ArrayList<>();
    }

    public void addToCustomList(int number){
        if (customSize == customList.length){
            int newSize = (int)(customList.length * 1.5);
            customList = Arrays.copyOf(customList, newSize);
        }
        customList[customSize] = number;
        customSize++;
    }

    public int getFromCustomList(int id) {
        if (id >= 0 && id < customSize) {
            return customList[id];
        } else {
            throw new IndexOutOfBoundsException("The ID is out of bounds.");
        }
    }


    @Override
    public void add(int number) {
        arrayList.add(number);
    }

    @Override
    public int get(int id) {
        return arrayList.get(id);
    }
}
