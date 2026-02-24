package intlist_interface;

public class IntArrayList implements  IntList{
    private int[] list=new int [10];
    private int size=0;
    public void add(int number) {
        if (size == list.length) {
            int newSize = size + size / 2;
            int[] newList = new int[newSize];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            this.list=newList;
        }
        list[size]=number;
        size++;
    }
    public int get(int id){
        return list[id];
    }
}