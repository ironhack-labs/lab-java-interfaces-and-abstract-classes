package Intlist;

public class IntListExample {
    public static void main(String[] args) {
        IntList list1 = new IntArrayList();
        IntList list2 = new IntVector();

        list1.add(5);
        list2.add(10);

        System.out.println("IntArrayList[0]: " + list1.get(0));
        System.out.println("IntVector[0]: " + list2.get(0));
    }
}
