package com.ironhack.IntListInterface;

public class Main {
    public static void main(String[] args) {

        IntVector vector = new IntVector();
        IntArrayList list = new IntArrayList();

        for(int i=0;i<12;i++){
            list.add(i+1);
        }
        System.out.println(list.get(11));

        for(int i=0;i<22;i++){
            vector.add(i+1);
        }
        System.out.println(vector.get(21));



    }
}
