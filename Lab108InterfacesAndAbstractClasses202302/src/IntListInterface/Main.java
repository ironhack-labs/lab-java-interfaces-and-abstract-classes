package IntListInterface;

public class Main {
    public static void main(String[] args) {
        IIntList listaArray = new IntArrayList();
        IIntList listaVector = new IntVector();

        //Agregar números
        for (int i = 0; i < 25; i++) {
            listaArray.addNumber(i);

        }
        //Agregar números
        for (int i = 0; i < 40; i++) {
            listaVector.addNumber(i);
        }
        //Buscar un elemento
        int position = listaArray.id(10);
        System.out.println("The 15 number index5 is: " + position);
        int position2 = listaVector.id(2);
        System.out.println("The 25 number index is: " + position2);

    }
}
