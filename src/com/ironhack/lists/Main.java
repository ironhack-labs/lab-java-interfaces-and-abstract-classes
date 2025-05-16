package com.ironhack.lists;

public class Main {
    public static void main(String[] args) {
        IntList arrayList = new IntArrayList();
        IntList vectorList = new IntVector();


        for (int i = 0; i < 15; i++) {
            arrayList.add(i);
            vectorList.add(i * 2);
        }

        System.out.println("IntArrayList contents:");
        for (int i = 0; i < 15; i++) {
            System.out.print(arrayList.get(i) + " ");
        }

        System.out.println("\n\nIntVector contents:");
        for (int i = 0; i < 15; i++) {
            System.out.print(vectorList.get(i) + " ");
        }
    }
}
