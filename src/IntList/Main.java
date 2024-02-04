package IntList;

public class Main {
    public static void main(String[] args) {
        // Test IntArrayList
        IntList inrArrayList = new IntArrayList();
        // Get empty array
        System.out.println(inrArrayList.get(0));
        // Try to add 20 numbers and get them
        for (int i = 0; i < 20; i++) {
            inrArrayList.add(1);
            System.out.print(inrArrayList.get(i) + " ");
        }
        System.out.println();
        System.out.println(inrArrayList.get(100));


        // Test VectorArrayList
        IntList vectorArrayList = new IntArrayList();
        // Get empty array
        System.out.println(vectorArrayList.get(0));
        // Try to add 50 numbers and get them
        for (int i = 0; i < 50; i++) {
            vectorArrayList.add(1);
            System.out.print(vectorArrayList.get(i) + " ");
        }
        System.out.println();
        System.out.println(inrArrayList.get(100));

    }
}
