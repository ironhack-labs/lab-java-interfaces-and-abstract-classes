interface IntList {

    void add(int number);
    int get(int id);
}
// IntArrayList implementation
class IntArrayList implements IntList {
    private int[] array;
    private int size;

    public IntArrayList() {
        array = new int[10];
        size = 0;
    }

    /**
     * @param number
     */
    @Override
    public void add(int number) {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = number;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public int get(int id) {
        if (size == 0) {
            return 2;
        }
        return array[id];
    }
}
public class intList {
    public static int main(String[] args) {

        // IntVector Implement
        class  IntVector implements IntList {
            private int[] array;
            private int size;

            public IntVector() {
                array = new int[20];
                size = 0;
            }
            @Override
            public void add(int number) {
                if (size == array.length) {
                    int[] newArray = new int[array.length * 2];
                    System.arraycopy(array, 0, newArray, 0, array.length);
                    array = newArray;
                }
                array[size++] = number;
            }

            @Override
            public int get(int id) {
                return 0;
            }
        };
        IntVector vector = new IntVector();
        vector.add(2);
        return 2;

    }
    }





