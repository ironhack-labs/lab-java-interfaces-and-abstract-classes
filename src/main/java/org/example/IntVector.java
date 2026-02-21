package org.example;

public class IntVector implements IntList{
private int[] vector;
private int size;

public IntVector(){
    vector = new int[20];
    size = 0;
}

    @Override
    public void add(int number) {
        if(size== vector.length){
            int newVectorLength = vector.length * 2;
            int[] newVector = new int[newVectorLength];

            for(int i=0;i<vector.length;i++){
               newVector[i] = vector[i];
            }
            vector = newVector;
        }
        vector[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
    if(id>size || id<0){
        throw new IndexOutOfBoundsException("Index: "+ id);
    } else {
        return vector[id];
    }
    }
}
