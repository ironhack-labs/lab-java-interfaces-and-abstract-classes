package IntLIstInterfyce;

public class IntVector implements IntList{
    int[] arrayA = new int[20];
    int size = 0;
    public void add(int number){

        if( size == arrayA.length) {
            int newLength = arrayA.length + arrayA.length;
            int[] arrayB = new int[newLength];
            for (int i = 0; i < size; i++) {
                arrayB[i] = arrayA[i];
            }
            arrayA = arrayB;
        }
        arrayA[size] = number;
        size++;
    }
    public int size() {
        return size;
    }
    public int get(int id){
        return arrayA[id];
    }
}

