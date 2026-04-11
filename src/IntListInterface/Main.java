package IntListInterface;

public class Main {

    public static void main(String[] args) {

        IntList list1 = new IntArrayList();
        IntList list2 = new IntVector();

        for (int i = 0; i < 15; i++) {
            list1.add(i);
            list2.add(i);
        }

        System.out.println(list1.get(5));
        System.out.println(list2.get(5));
    }
}