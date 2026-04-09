package IntListInterface;

public class Application {
    public static void main(String[] args) {

        System.out.println("--- Probando IntArrayList (Crece un 50%) ---");
        IntList miArrayList = new IntArrayList();


        for (int i = 0; i < 12; i++) {
            miArrayList.add(i * 10); // Añadimos 0, 10, 20, 30...
        }
        System.out.println("Elemento en ID 11: " + miArrayList.get(11));


        System.out.println("\n--- Probando IntVector (Crece un 100%) ---");
        IntList miVector = new IntVector();


        for (int i = 0; i < 25; i++) {
            miVector.add(i * 100); // Añadimos 0, 100, 200, 300...
        }
        System.out.println("Elemento en ID 21: " + miVector.get(21));

    }
}
