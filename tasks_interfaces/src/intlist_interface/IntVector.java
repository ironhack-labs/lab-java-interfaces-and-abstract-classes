package intlist_interface;

public class IntVector implements IntList{
    int[] array=new int[20];
    int size=0;
    public void add(int number){
        if(size== array.length){
            int newSize=size*2;
            int [] newArray=new int [newSize];
            for(int i=0; i<array.length; i++){
                newArray[i]=array[i];
            }
            this.array=newArray;
        }
        array[size]=number;
        size++;
    }
    public int get(int id){
        return array[id];
    }
}
