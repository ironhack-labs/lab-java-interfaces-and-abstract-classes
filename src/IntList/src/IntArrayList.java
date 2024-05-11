public class IntArrayList implements IntList{

    private int cap = 10;
    private int[] array = new int[cap];


    @Override
    public void add(int number) {



        if (array.length >= cap){

            int newCap = array.length+array.length/2;
            int[] newArray = new int[newCap];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;

            }

        array[cap++] = number;
        }



    @Override
    public int get(int id) {

        return array[id];

    }
}
