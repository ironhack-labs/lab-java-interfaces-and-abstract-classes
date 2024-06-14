public class IntVector implements IntList{
    private int[] array;

    public IntVector(int[] array) {
        this.array = array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public IntVector() {
        int[] array = new int[20];
    }

    @Override
    public void add(int number) {
        if (array[array.length-1] != 0){
            int[] newarr = new int[array.length * 2];
            for (int i = 0; i < array.length; i++){
                newarr[i] = array[i];
            }
            newarr[array.length] = number;
            setArray(newarr);

        } else {
            for (int i =0; i < array.length; i ++){
                if (array[i] != 0){
                    array[i] = number;
                    i += array.length;
                }
            }
        }

    }

    @Override
    public int get(int id) {
        return 0;
    }
}
