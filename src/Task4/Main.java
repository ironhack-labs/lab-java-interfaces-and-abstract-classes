package Task4;

public class Main {
    public static void main(String[] args) {

        IntList list1 = new IntArrayList();
        IntList list2 = new IntVector();

        for (int i = 1; i <= 15; i++) {
            list1.add(i);
        }

        for (int i = 1; i <= 25; i++) {
            list2.add(i);
        }
        

        System.out.println("IntArrayList index 10: " + list1.get(10));
        System.out.println("IntVector index 20: " + list2.get(20));
    }
}