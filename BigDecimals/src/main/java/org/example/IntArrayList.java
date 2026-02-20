package org.example;

public class IntArrayList implements IntList {

private int [] array=new int[10];
private int size=0;

    @Override
    public void add(int number) {
if (size==array.length){
int sizeNew =array.length+ (array.length/2);
int [] newArray=new int[sizeNew];
for (int i=0;i< array.length;i++){
    newArray[i]=array[i];
}
array=newArray;
}
        array[size++]=number;
    }

    @Override
    public int get(int id) {
        return array[id];
    }
}
