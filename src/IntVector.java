public class IntVector implements IntList{
    private int[] vector;
    private int store = 20;
    private int idx = -1;

    //CONSTRUCTOR
    public IntVector(){
        this.vector = new int[store];
        setStore(this.store);
        setIdx(this.idx);
    }

    //SETTERS
    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public void setStore(int store) {
        this.store = store;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    //GETTERS
    public int[] getVector() {
        return this.vector;
    }

    public int getStore() {
        return this.store;
    }

    public int getIdx() {
        return this.idx;
    }

    //FUNCTIONS
    //Add a new element. If the vector is full create a new array with double size and add the new element.
    @Override
    public void add(int number){
        this.idx++;
        if (this.idx == store){
            setStore(this.store * 2);
            int [] newVector = newVectorAddElements(this.vector, this.store);
            setVector(newVector);
        }
        this.vector[this.idx] = number;
    }

    //Get an element
    @Override
    public int get(int id){
        return (this.vector[id]);
    }

    //Create a new Vector with a specific storage
    public int[] newVectorAddElements(int[] origin, int store){
        int[] newVector = new int[store];
        System.arraycopy(origin, 0, newVector, 0, origin.length);

        return(newVector);
    }

}
