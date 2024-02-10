import java.util.ArrayList;
import java.util.List;

class interfaces{
    public interface IntList {
        void add(int number);
        void get(int id);
    }
}

class IntArrayList implements interfaces.IntList {
    private List<Integer> numbers;

    public IntArrayList(List<Integer> numbers){
        setNumbers(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        setNumbers(numbers);
    }

    public void add(int x){
        numbers.add(x);
    }

    @Override
    public void get(int id) {
        if (numbers.size() > 10){
            numbers = new ArrayList<>((numbers.size() + (numbers.size()/2)));
        }
    }
}
