package IntListInterface;

public class IntListTest {
    public static void main(String[] args) {
        IntList list1 = new IntArrayList();
        IntList list2 = new IntVector();

        for (int i = 0; i < 20; i++) {
            list1.add(i);
        }

        for (int i = 0; i < 30; i++) {
            list2.add(i);
        }

        System.out.println("IntArrayList for index 15: " + list1.get(15));
        System.out.println("IntVector for index 23: " + list2.get(23));
    }
}
