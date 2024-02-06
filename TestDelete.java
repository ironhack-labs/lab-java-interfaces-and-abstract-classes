public class TestDelete {

    public static void main(String[] args) {

        IntArrayList test = new IntArrayList();

        for (int i = 0; i < 11; i++) {
            test.add(i);
            System.out.println("Max size: " + test.getMaxArraySize());
            System.out.println("Current size: " + test.getCurrentSize());

            if (i < test.getCurrentSize()) {
                System.out.println("Position " + i + " of the array has the value: " + test.get(i));
            } else {
                System.out.println("Invalid index: " + i);
            }

            System.out.println("***********************************");
        }

        System.out.println("***********************************");
        System.out.println("***********************************");
        System.out.println("***********************************");
        System.out.println("***********************************");

        IntVector test2 = new IntVector();

        for (int i = 0; i < 21; i++) {
            test2.add(i);
            System.out.println("Max size: " + test2.getMaxArraySize());
            System.out.println("Current size: " + test2.getCurrentSize());

            if (i < test2.getCurrentSize()) {
                System.out.println("Position " + i + " of the array has the value: " + test2.get(i));
            } else {
                System.out.println("Invalid index: " + i);
            }

            System.out.println("***********************************");
        }

    }
}
