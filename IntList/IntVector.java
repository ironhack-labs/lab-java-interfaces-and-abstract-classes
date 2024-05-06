package IntList;

public class IntVector implements IntList {
    @Override
    public void addNumber(int number) {

    }

    @Override
    public int get(int id) {
        return 0;
    }


        private static final int DEFAULT_CAPACITY = 20;
        private int[] array;
        private int size;

        public IntVector() {
            array = new int[DEFAULT_CAPACITY];
            size = 0;
        }

        public void add(int element) {
            ensureCapacity(size + 1);
            array[size] = element;
            size++;
        }

        private void ensureCapacity(int minCapacity) {
            if (minCapacity > array.length) {
                int newCapacity = array.length * 2;
                if (minCapacity > newCapacity) {
                    newCapacity = minCapacity;
                }
                int[] newArray = new int[newCapacity];
                System.arraycopy(array, 0, newArray, 0, size);
                array = newArray;
            }
        }


    }

