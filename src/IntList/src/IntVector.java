public class IntVector implements IntList {

    private int cap = 20;
    private int[] intVector = new int[cap];

    @Override
    public void add(int number) {

        if (intVector.length == cap) {

            int newCap = cap * 2;
            int[] newIntVector = new int[newCap];
            System.arraycopy(intVector, 0, newIntVector, 0, cap);
            intVector = newIntVector;
        }

            intVector[cap++] = number;


    }

    @Override
    public int get(int id) {
        return 0;
    }
}
