import java.util.List;
import java.util.ArrayList;
public class IntArrayList implements IntList{

    private List<Integer> arrayList;
    private int store = 10;

    //CONSTRUCTOR
    public IntArrayList(){
        this.arrayList = createArrayList(this.store);
        setStore(this.store);
    }

    //SETTERS
    public void setArrayList(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void setStore(int store) {
        this.store = store;
    }

    //GETTERS
    public List<Integer> getArrayList() {
        return this.arrayList;
    }

    public int getStore() {
        return this.store;
    }

    //FUNCTIONS
    //Add a new element. If the array is full create a new array that is 50% larger and add the new element.
    @Override
    public void add(int number){

        if (this.arrayList.size() == this.store){
            setStore(this.store + this.store/2);
            List<Integer> newArrayList = createArrayList(this.store);
            newArrayList.addAll(getArrayList());
            setArrayList(newArrayList);
        }
        this.arrayList.add(number);
    }

    //Get an element of array list
    @Override
    public int get(int id){
        return (this.arrayList.get(id));
    }

    //Create a new Array list with a specific storage
    public List<Integer> createArrayList(int store) {
        return (new ArrayList<>(store));
    }
}
