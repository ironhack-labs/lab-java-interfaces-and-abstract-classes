package IntList_Interface;

public class Main {
    public static void main(String[] args) {
        IntList arrayList = new IntArrayList();
        IntList vector = new IntVector();

        for (int i = 0; i < 25; i++) {
            arrayList.add(i);
            vector.add(i * 2);
        }

        System.out.println("IntArrayList[10] = " + arrayList.get(10));
        System.out.println("IntVector[10] = " + vector.get(10));
    }
}