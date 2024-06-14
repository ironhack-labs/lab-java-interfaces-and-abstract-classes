import java.util.Vector;

public class IntVector implements IIntList{
private Vector<Integer> list;

    public IntVector(){
        list = new Vector<>();
    }


    @Override
    public void add(int number) {

    }

    @Override
    public int get(int id) {
        if (id >= 0 && id < list.size()){
            return list.get(id);
        }else {
            throw new IndexOutOfBoundsException("The ID is out of bounds.");
        }
    }
}
