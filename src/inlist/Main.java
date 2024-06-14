package inlist;

public class Main {
    public static void main(String[] args) {
        IntArrayList storeArray = new IntArrayList();
        IntVector storeVector = new IntVector();

        storeArray.add(10);
        storeArray.add(15);

        storeVector.add(2);
        storeVector.add(4);

        System.out.println(storeArray.get(0));
        System.out.println(storeVector.get(1));


    }
}
