package IntListInterface;

public class IntListTest {
    public static void main(String[] args) {
        testIntArrayList();
        testIntVector();
    }

    private static void testIntArrayList() {
        System.out.println("Testing IntArrayList:");
        IntList intArrayList = new IntArrayList();

        // Adding elements
        for (int i = 0; i < 50; i++) {
            intArrayList.add(i);
        }

        // Retrieving elements
        for (int i = 0; i < 50; i++) {
            System.out.println("Element at index " + i + ": " + intArrayList.get(i));
        }
    }

    private static void testIntVector() {
        System.out.println("\nTesting IntVector:");
        IntList intVector = new IntVector();

        // Adding elements
        for (int i = 0; i < 100; i++) {
            intVector.add(i);
        }

        // Retrieving elements
        for (int i = 0; i < 100; i++) {
            System.out.println("Element at index " + i + ": " + intVector.get(i));
        }
    }
}