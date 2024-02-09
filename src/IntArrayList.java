import java.util.ArrayList;
import java.util.List;


public class IntArrayList implements IntList{
    private int[] numbers_list;
    private int size;
    private boolean isFull(){
      return  this.numbers_list.length == size;
    }

    public IntArrayList() {
        numbers_list = new int[10];
        size =0;
    }


    @Override
    public void add(int number){
        if (isFull()){
            int new_len =numbers_list.length+(numbers_list.length/2);
            int[] new_array= new int[new_len];
            System.arraycopy(numbers_list, 0, new_array, 0, numbers_list.length);
            numbers_list = new_array;
        }
        numbers_list[size++] = number;

    }

    @Override
    public int get(int id){
        if(id>=size)
            return 0;
        else{
        return numbers_list[id];
         }
    }
}
