package IntList;
import java.util.ArrayList;
import java.util.List;

public class main implements IntList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("List" + list);


    }

    @Override
    public void addNumber(int number) {

    }

    @Override
    public int get(int id) {

        return id;
    }
}

