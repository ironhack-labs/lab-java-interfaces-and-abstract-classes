package Interface;

import java.sql.Array;

public class IntArrayList implements IntList {




    public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length){
        int[] sourceArray = new int[] {1,2,3,4,5,6,7,8,9,10};
        int[] destinationArray = new int[10];
        System.arraycopy(sourceArray, 0, destinationArray, 4, sourceArray.length);

        System.out.println(Array.toString(destinationArray));
    }




    @Override
    public int add(int number) {
        return 0;
    }

    @Override
    public int get(int id) {
        return 0;
    }
}
