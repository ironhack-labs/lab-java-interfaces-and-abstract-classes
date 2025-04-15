package com.ironhack;

public class Main {
    public static void main(String[] args) {
        // Construction of Object(ArrayList)
        IntArrayList intArrayList = new IntArrayList();

        // Add number for testing
        for (int i = 0; i <= 61; i++) {
            intArrayList.addNumberToList(i);
            System.out.println("Ajouté : " + i);
        }


    }
}