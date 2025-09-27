package IntListInterface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IntList arrayList = new IntArrayList();
        System.out.println("Adding elemnets to IntArrayList:");
        for (int i = 1; i <= 20; i++) {
            arrayList.add(i);
            System.out.println("Added " + i + ", size now: " + ((IntArrayList) arrayList).size());
        }

        System.out.println("Getting element at Index 5: " + arrayList.get(5));
        System.out.println();

        IntList vectorList = new IntVector();
        System.out.println("Adding elements to IntVector:");
        for (int i = 1; i <= 40; i++) {
            vectorList.add(i);
            System.out.println("Added " + i + ", size now: " + ((IntVector) vectorList).size());
        }

        System.out.println("Getting element at Index 10: " + vectorList.get(10));


    }
}
