package com.ironhack.lab108.intlist;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********************** IntArrayList Class ***********************\n");
        IntArrayList arrayLarger = new IntArrayList();
        System.out.println("******* Add method: *******");
        arrayLarger.add(11);
        System.out.println("\n******* Get method: *******");
        arrayLarger.get(9);

        System.out.println("\n*********************** IntVector Class ***********************\n");
        IntVector arrayDouble = new IntVector();
        System.out.println("******* Add method: *******");
        arrayDouble.add(99);
        System.out.println("\n******* Get method: *******");
        arrayDouble.get(17);

    }
}
