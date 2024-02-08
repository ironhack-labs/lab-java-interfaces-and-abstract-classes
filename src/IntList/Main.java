package IntList;

public class Main {
    public static void main(String[] args) {
        IntList list = new IntArrayList();
        for(int i = 0; i < 25; i++){
            list.add(i);
            System.out.println(list.get(i));
        }

        IntList vector = new IntVector();
        for(int i = 0; i < 25; i++){
            vector.add(i);
            System.out.println(vector.get(i));
        }
    }
}
