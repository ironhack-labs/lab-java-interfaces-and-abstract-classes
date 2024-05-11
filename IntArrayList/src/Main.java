//Even to printout the things was hard, need to recap this topic, not fully get it.

public class Main {
    public static void main(String[] args) {

        IntList list1 = new IntArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println("Numbers IntArrayList:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Number position " + i + ": " + list1.get(i));
        }


        IntList list2 = new IntVector();
        list2.add(1);
        list2.add(2);
        list2.add(3);


        System.out.println("\nNumbers IntVector:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Number position " + i + ": " + list2.get(i));
        }
    }
}
