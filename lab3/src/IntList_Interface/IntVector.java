package IntList_Interface;

public class IntVector implements IntList {

private int currentIndex = 0;

    private int[] array = new int[10];
    

    @Override
    public void add(int eded) {

        
        if (currentIndex == array.length) {

            int[] newarr = new int[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                newarr[i] = array[i];

            }

            array = newarr;
        }

        array[currentIndex] = eded;
        currentIndex++;

    }

    @Override
    public int get(int id) {

        if (id >= 0 && id < array.length) {
            return array[id];
        } 
        else {
            return -1;
            //
        }
    }

}
