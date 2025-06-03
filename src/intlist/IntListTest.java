package intlist;

public class IntListTest {
    public static void main(String[] args) {
        IntList arrayList = new IntArrayList();
        IntList vectorList = new IntVector();

        // Añadimos 15 números para forzar la expansión de IntArrayList
        for (int i = 0; i < 15; i++) {
            arrayList.add(i * 2); // 0, 2, 4, ...
        }

        // Añadimos 25 números para forzar la expansión de IntVector
        for (int i = 0; i < 25; i++) {
            vectorList.add(i * 3); // 0, 3, 6, ...
        }

        // Mostramos algunos valores
        System.out.println("IntArrayList → valor en índice 12: " + arrayList.get(12)); // Esperado: 24
        System.out.println("IntVector → valor en índice 20: " + vectorList.get(20));   // Esperado: 60
    }
}
