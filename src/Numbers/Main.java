package Numbers;

public class Main {
    public static void main(String[] args) {
        IntList arrayList  = new IntArrayList();
            for (int i = 0; i < 20; i++){
                arrayList.add(i);
            }
            System.out.println("The 15th of ArrayList number is " + arrayList.get(15));

        IntList vector = new IntVector();
        for (int i = 0; i < 20; i++){
            vector.add(i);
        }
        System.out.println("The 15th of vector number is " + vector.get(15));
        }


    }

