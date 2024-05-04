package Task4;


public class IntArrayList implements IntList{
    int size = 10;
    int currentIndex = 0;
    Integer[] arrayList = new Integer[size];
    @Override
    public void add(int number) {
        if (currentIndex == arrayList.length){
            int newsize = arrayList.length + arrayList.length / 2;
            Integer[] arrayList2 = new Integer[newsize];
            System.arraycopy(arrayList, 0, arrayList2, 0, arrayList.length);
            arrayList = arrayList2;
        }
        arrayList[currentIndex++] = number;
    }

    public int get(int id) {
        if (id < 0 || id >= currentIndex) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return arrayList[id];
    }
}
