package Int;

public class Main {
    public static void main(String[] args) {
        // --- Test IntArrayList (Capacità iniziale 10, cresce del 50%) ---
        IntArrayList myArrayList = new IntArrayList();
        System.out.println("Test IntArrayList:");

        // Aggiungiamo 12 elementi per forzare il primo ridimensionamento (da 10 a 15)
        for (int i = 1; i <= 12; i++) {
            myArrayList.add(i * 10);
        }

        System.out.println("Elemento a id 0: " + myArrayList.get(0));   // 10
        System.out.println("Elemento a id 11: " + myArrayList.get(11)); // 120
        System.out.println();


        // --- Test IntVector (Capacità iniziale 20, raddoppia) ---
        IntList myVector = new IntVector();
        System.out.println("Test IntVector:");

        // Aggiungiamo 25 elementi per forzare il primo ridimensionamento (da 20 a 40)
        for (int i = 1; i <= 25; i++) {
            myVector.add(i * 100);
        }

        System.out.println("Elemento a id 0: " + myVector.get(0));    // 100
        System.out.println("Elemento a id 24: " + myVector.get(24));  // 2500

        // Test errore (ID fuori dai limiti)
        try {
            System.out.println(myVector.get(100));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nErrore gestito: ID 100 non esiste ancora.");
        }
    }
}
