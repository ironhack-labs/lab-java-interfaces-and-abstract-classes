package intlistinterface;

public class IntListInterface {
    public static void main(String[] args) {
        IntList list = new IntArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        list.add(11);

        System.out.println(list.get(10));

        IntList list2 = new IntVector();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        list2.add(11);

        System.out.println(list2.get(10));

    }
}
